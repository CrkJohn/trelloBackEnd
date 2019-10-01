package ieti.trello.backend.trello.entities;


import java.util.*;

public class Team{

    private List<User> members;
    private List<Dashboard> dashboard;
    private String name;
    private String description;

    public Team(String name, String description) {
        this.name = name;
        this.description = description;
    }
    
    public List<User> getMembers() {
        return members;
    }

    public void setMembers(List<User> members) {
        this.members = members;
    }

    public List<Dashboard> getDashboard() {
        return dashboard;
    }

    public void setDashboard(List<Dashboard> dashboard) {
        this.dashboard = dashboard;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}