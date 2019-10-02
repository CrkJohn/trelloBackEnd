package ieti.trello.backend.trello.entities;


import java.util.*;


public class Task{


    private List<User> members;
    private List<Comment> comments;
    private State state; 
    private Label label;
    private Date expirationDate;
    private String name;
    private String description;
    private String id;



    public Task(String name, Date expirationDate){
        this.name = name;
        this.expirationDate = expirationDate;
    }

    public Task(){
        members = new ArrayList<User>();
        comments = new ArrayList<Comment>();
    }

    public void setName(String name){
        this.name  = name;
    }

    public void addMember(User user){
        members.add(user);
    }

    public void deleteMember(User user){
        boolean found = false;
        for(int index = 0; index < members.size() && !found ; index++){
            if(members.get(index).equals(user)){
                found = true;
            }
        }
        if(found){
            members.add(user);
        }
    }

    public void setDescription(String description){
        this.description = description;
    }

    public List<User> getMembers() {
        return members;
    }

    public void setMembers(List<User> members) {
        this.members = members;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public Label getLabel() {
        return label;
    }

    public void setLabel(Label label) {
        this.label = label;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    

}