package ieti.trello.backend.trello.persistence;

import ieti.trello.backend.trello.entities.*;
import org.springframework.stereotype.Repository;

import java.util.*;


@Repository
public interface ITaskPersistence {
    /*
        public void addUser(User usr);
        public void deleteUser(int id);


        private List<User> members;
        private List<Dashboard> dashboard;
        private String name;
        private String description;

    public void addTeam(int idUser, String name , String description);
    public void addMemberTeam(int idUser, int idTeams , User user);
    public void deleteMemberTeam(int idUser, int idTeams , int idUserDel);
    public void addDashboarTeam(int idUser, int idTeams, Dashboard dashboard);
    public void addTaskDashboarTeam(int idUser, int idTeams, int idDashboar, Task task);
    public void deleteTaskDashboarTeam(int idUser, int idTeams, int idDashboar, int task);
    public void setNameTeam(String name, int idUser , int idTeams);
    public void setDescriptionTeam(String description, int idUser , int idTeams);
    


        user dashboard
        public List<User> members;
        public List<Comment> comments;
        public State state; 
        public Labels label;
        public Date expirationDate;
        public String name;
        public String description;

    public void addDashboardUser(int idUser, Dashboard dashboard);
    public void addTaskToDasboardUser(int idUser, int idDasboard, Task task);
    public void setDescriptionTaskUser(int idUser,int idDasboard,int idTask , String description);
    public void setNameTaskUser(int idUser,int idDasboard,int idTask , String name);
    public void setExperitionDateTaskUser(int idUser,int idDasboard , int idTask,Date date);
    public void setLabelTaskUser(int idUser,int idDasboard , int idTask,Label label);
    public void setStateTaskUser(int idUser,int idDasboard , int idTask,Label label);
    public void addComment(int idUser, int idDasboard, Comment comment);
    public void deleteComment(int idUser, int idDasboard, int idComment);
    public void addMember(int idUser, int idDasboard ,User user);
    public void deleteMember(int idUser, int idDasboard ,int idUserDel);
     */

    List<Task> geTasksList();

    Task getTaskById(String id);

    List<Task> getTasksByUserId(String userId);

    Task assignTaskToUser(String taskId, User user);

    void removeTask(String taskId);

    Task updateTask(Task task);


    
}