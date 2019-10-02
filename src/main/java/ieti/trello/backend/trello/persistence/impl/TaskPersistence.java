package ieti.trello.backend.trello.persistence.impl;

import ieti.trello.backend.trello.database.DataBasesCli;
import ieti.trello.backend.trello.entities.Task;
import ieti.trello.backend.trello.entities.User;
import ieti.trello.backend.trello.persistence.ITaskPersistence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class TaskPersistence implements ITaskPersistence {

    @Autowired
    private DataBasesCli database;


    @Override
    public List<Task> geTasksList() {
        return database.geTasksList();
    }

    @Override
    public Task getTaskById(String id) {
        return database.getTaskById(id);
    }

    @Override
    public List<Task> getTasksByUserId(String userId) {
        return database.getTasksByUserId(userId);
    }

    @Override
    public Task assignTaskToUser(String taskId, User user) {
        return database.assignTaskToUser(taskId, user);
    }

    @Override
    public void removeTask(String taskId) {
        database.removeTask(taskId);
    }

    @Override
    public Task updateTask(Task task) {
        return database.updateTask(task);
    }
}
