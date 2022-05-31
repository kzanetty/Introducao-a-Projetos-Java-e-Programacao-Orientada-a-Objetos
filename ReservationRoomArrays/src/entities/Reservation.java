package entities;

public class Reservation {

    private String name;
    private String email;
    private Integer room;

    public Reservation(String name, String email, Integer room){
        this.name = name;
        this.email = email;
        this.room = room;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getRoom() {
        return room;
    }

    public void setRoom(Integer room) {
        this.room = room;
    }

    @Override
    public String toString(){
        return "Name: "+name+" - Email: "+email+" - Room: "+room;
    }
}
