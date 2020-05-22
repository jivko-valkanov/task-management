package org.zhivko.taskManagement.services;

public interface TaskService {

    public void getInboxTasks();

    public void getDailyTasks();

    public void getTasksForNextSevenDays();

    public void makeTask();

    public void updateTask();

    public void deleteTask();

}
