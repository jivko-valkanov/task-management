package org.zhivko.taskManagement.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zhivko.taskManagement.data.entities.Priority;
import org.zhivko.taskManagement.data.repositories.TaskRepository;
import org.zhivko.taskManagement.services.TaskService;
import org.zhivko.taskManagement.web.models.TaskDto;

import java.util.ArrayList;
import java.util.List;

@Service
public class TaskServiceImpl implements TaskService {

    private TaskRepository taskRepository = null;

    @Autowired
    public TaskServiceImpl(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public List<TaskDto> getInboxTasks() {
        List<TaskDto> list = new ArrayList<>();
        list.add(new TaskDto(1,"Make a new web system", false, Priority.HIGH));
        list.add(new TaskDto(2,"Take a beer from store", false, Priority.NORMAL));
        list.add(new TaskDto(3,"Car wash", false, Priority.NORMAL));
        list.add(new TaskDto(4,"test", false, Priority.NORMAL));
        list.add(new TaskDto(5,"test for test :)", true, Priority.NORMAL));


        return list;
    }

    @Override
    public void getDailyTasks() {

    }

    @Override
    public void getTasksForNextSevenDays() {

    }

    @Override
    public void makeTask() {

    }

    @Override
    public void updateTask() {

    }

    @Override
    public void deleteTask() {

    }
}
