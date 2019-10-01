package ieti.trello.backend.trello.entities;


public class Comment{
    private int idUser;
    private String comment;
    private int id;

    public Comment(int user, String comment, int id){
        this.idUser = user;
        this.comment = comment;
        this.id = id;
    }

    public int getUser() {
        return idUser;
    }

    public void setUser(int user) {
        this.idUser = user;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
    
    

}