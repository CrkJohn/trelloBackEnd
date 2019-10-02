package ieti.trello.backend.trello.entities;


import java.util.*;


public class User{
    private String name;
    private String email;
    private String initials;
    private String password;
    private List<Dashboard> dashboards;
    private List<Team> teams;
    private String id;
    

    public User(String name, String email, String initials, String password) {
        this.name = name;
        this.email = email;
        this.initials = initials;
        this.password = password;
    }

    public User(){}


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

    public String getInitials() {
        return initials;
    }

    public void setInitials(String initials) {
        this.initials = initials;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Dashboard> getDashboards() {
        return dashboards;
    }

    public void setDashboards(List<Dashboard> dashboards) {
        this.dashboards = dashboards;
    }

    public List<Team> getTeams() {
        return teams;
    }

    public void setTeams(List<Team> teams) {
        this.teams = teams;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    

}