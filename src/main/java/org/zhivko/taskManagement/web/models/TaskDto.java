package org.zhivko.taskManagement.web.models;

import org.zhivko.taskManagement.data.entities.Priority;

public class TaskDto {

    private long id = 0;

    private String taskSubject = null;

    private boolean isComplete = false;

    private Priority priority = null;

    public TaskDto() {
    }

    public TaskDto(long id, String taskSubject, boolean isComplete, Priority priority) {
        this();
        this.id = id;
        this.taskSubject = taskSubject;
        this.isComplete = isComplete;
        this.priority = priority;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTaskSubject() {
        return taskSubject;
    }

    public void setTaskSubject(String taskSubject) {
        this.taskSubject = taskSubject;
    }

    public boolean isComplete() {
        return isComplete;
    }

    public void setComplete(boolean complete) {
        isComplete = complete;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }
}
