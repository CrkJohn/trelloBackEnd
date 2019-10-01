package ieti.trello.backend.trello.entities;

import java.io.*;
import java.util.*;


public class Dashboard{

    public String name;
    public List<User> members;
    public List<Task> tasks;
    public int id;


    public Dashboard(String name, List<User> members) {
        this.name = name;
        this.members = members;
    }

    public Dashboard(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<User> getMembers() {
        return members;
    }

    public void setMembers(List<User> members) {
        this.members = members;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }
}
