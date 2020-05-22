package org.zhivko.taskManagement.data.entities;

import org.zhivko.taskManagement.data.entities.base.BaseEntity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "labels")
public class Label extends BaseEntity {

    @Column(name = "label_name",
            nullable = false,
            columnDefinition = "VARCHAR(50)")
    private String labelName = null;

    @ManyToOne
    @JoinColumn(name="color_id",
            nullable=false)
    private Color labelColor = null;

    @ManyToOne
    @JoinColumn(name = "user_id",
            nullable = false)
    private User user = null;

    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(name="labels_tasks",
            joinColumns={@JoinColumn(name="label_id")},
            inverseJoinColumns={@JoinColumn(name="task_id")})
    private List<Task> tasks = null;

    public Label() {
        this.tasks = new ArrayList<>();
    }

    public String getLabelName() {
        return labelName;
    }

    public void setLabelName(String labelName) {
        this.labelName = labelName;
    }

    public Color getLabelColor() {
        return labelColor;
    }

    public void setLabelColor(Color labelColor) {
        this.labelColor = labelColor;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }
}
