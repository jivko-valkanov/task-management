package org.zhivko.taskManagement.services;

import org.zhivko.taskManagement.web.models.TaskDto;

import java.util.List;

public interface TaskService {

    public List<TaskDto> getInboxTasks();

    public void getDailyTasks();

    public void getTasksForNextSevenDays();

    public void makeTask();

    public void updateTask();

    public void deleteTask();

}
