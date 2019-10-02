package ieti.trello.backend.trello.persistence.impl;

import ieti.trello.backend.trello.entities.User;
import ieti.trello.backend.trello.persistence.IUserPersistence;
import ieti.trello.backend.trello.database.DataBasesCli;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class UserPersistence implements IUserPersistence{

    @Autowired
    private DataBasesCli database;

    @Override
    public List<User> getUsersList() {
        return database.getUsersList();
    }

    @Override
    public User getUserById(String userId) {
        return database.getUserById(userId);
    }

    @Override
    public User createUser(User user) {
        return database.createUser(user);
    }

    @Override
    public User updateUser(User user) {
        return database.updateUser(user);
    }

    @Override
    public void removeUser(String userId) {
        database.removeUser(userId);
    }
}
