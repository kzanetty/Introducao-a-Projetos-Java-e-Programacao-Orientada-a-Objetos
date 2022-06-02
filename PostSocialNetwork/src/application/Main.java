package application;

import entities.Comments;
import entities.Post;

import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        Date date = new Date();
        System.out.print("Title: ");
        String title = sc.nextLine();
        System.out.print("Content: ");
        String content = sc.nextLine();
        System.out.print("Likes: ");
        int likes = sc.nextInt();
        Post post = new Post(date, title, content, likes);

        System.out.print("Number of comments: ");
        int n = sc.nextInt();
        sc.nextLine();
        for(int i=0; i<n; i++){
            System.out.print("Comment: ");
            String comment = sc.nextLine();
            post.addComment(new Comments(comment));
            System.out.println();
        }

        System.out.println(post);


        sc.close();
    }
}
