package ieti.trello.backend.trello.database;

import javax.annotation.PostConstruct;

import ieti.trello.backend.trello.entities.*;
import java.util.*;

public class DataBasesCli {

    private static List<User> users = new ArrayList<User>();
    private static List<Task> tasks = new ArrayList<Task>();


    public DataBasesCli(){}

    @PostConstruct
    private void init(){




    }


}
