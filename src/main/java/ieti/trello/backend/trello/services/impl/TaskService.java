package ieti.trello.backend.trello.services.impl;

import ieti.trello.backend.trello.entities.Task;
import ieti.trello.backend.trello.entities.User;
import ieti.trello.backend.trello.persistence.ITaskPersistence;
import ieti.trello.backend.trello.services.ITaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class TaskService implements ITaskService {

    @Autowired
    ITaskPersistence iTaskPersistence;


    @Override
    public List<Task> geTasksList() {
        return null;
    }

    @Override
    public Task getTaskById(String id) {
        return null;
    }

    @Override
    public List<Task> getTasksByUserId(String userId) {
        return null;
    }

    @Override
    public Task assignTaskToUser(String taskId, User user) {
        return null;
    }

    @Override
    public void removeTask(String taskId) {

    }

    @Override
    public Task updateTask(Task task) {
        return null;
    }
}
