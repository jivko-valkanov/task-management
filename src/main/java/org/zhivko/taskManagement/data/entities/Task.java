package org.zhivko.taskManagement.data.entities;

import org.hibernate.annotations.Type;
import org.zhivko.taskManagement.data.entities.base.BaseEntity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "tasks")
public class Task extends BaseEntity {

    @Column(name = "task_subject",
            nullable = false,
            columnDefinition = "TEXT")
    private String subject = null;

    @ManyToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "task_parent_id")
    private Task parent = null;

    @OneToMany(mappedBy = "parent",
            fetch = FetchType.EAGER,
            cascade = {CascadeType.ALL})
    private List<Task> tasks = null;

    @ManyToMany(mappedBy = "tasks")
    private List<Label> labels = null;

    @Enumerated(EnumType.STRING)
    @Column(name = "priority", nullable = false,
            columnDefinition = "TINYINT(1) DEFAULT 1")
    private Priority priority = null;

    @Column(name = "due_date",
            nullable = false)
    private Date dueDate = null;

    @Type(type= "org.hibernate.type.NumericBooleanType")
    @Column(name = "is_completed",
            nullable = false,
            columnDefinition = "TINYINT(1) DEFAULT 0")
    private boolean isCompleted = false;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "completed_at")
    private Date completedAt = null;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="user_id")
    private User user = null;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "project_id")
    private Project project = null;

    public Task() {
        this.tasks = new ArrayList<>();
        this.labels = new ArrayList<>();
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Task getParent() {
        return parent;
    }

    public void setParent(Task parent) {
        this.parent = parent;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }

    public List<Label> getLabels() {
        return labels;
    }

    public void setLabels(List<Label> labels) {
        this.labels = labels;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }

    public Date getCompletedAt() {
        return completedAt;
    }

    public void setCompletedAt(Date completedAt) {
        this.completedAt = completedAt;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }
}
