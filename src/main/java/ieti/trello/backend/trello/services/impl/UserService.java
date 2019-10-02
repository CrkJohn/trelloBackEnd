package ieti.trello.backend.trello.services.impl;

import ieti.trello.backend.trello.entities.User;
import ieti.trello.backend.trello.persistence.IUserPersistence;
import ieti.trello.backend.trello.services.ITaskService;
import ieti.trello.backend.trello.services.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class UserService implements IUserService {

    @Autowired
    IUserPersistence iUserService;


    @Override
    public List<User> getUsersList() {
        return iUserService.getUsersList();
    }

    @Override
    public User getUserById(String userId) {
        return iUserService.getUserById(userId);
    }

    @Override
    public User createUser(User user) {
        return iUserService.createUser(user);
    }

    @Override
    public User updateUser(User user) {
        return iUserService.updateUser(user);
    }

    @Override
    public void removeUser(String userId) {
        iUserService.removeUser(userId);
    }
}
