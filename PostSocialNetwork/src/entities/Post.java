package entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class Post {

    private Date moment;
    private String title;
    private String content;
    private Integer likes;

    private List<Comments> comments = new ArrayList<>();

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Post(Date moment, String title, String content, Integer likes) {
        this.moment = moment;
        this.title = title;
        this.content = content;
        this.likes = likes;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public List<Comments> getComments() {
        return comments;
    }

    public void addComment(Comments comment){
        comments.add(comment);
    }
    public void removeComment(Comments comment){
        comments.remove(comment);
    }

    public void printList(){
        for(Comments x: comments){
            System.out.println(x);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Title: " + title +"\n");
        sb.append("Moment: " + sdf.format(moment) +"\n");
        sb.append("Content: " + content +"\n");
        sb.append("Likes: " + likes +"\n");
        sb.append("Comments: \n" );
        for (Comments x : comments) {
            sb.append(x +"\n");
        }
        return sb.toString();
    }
}
