package org.zhivko.taskManagement.data.entities;

import org.zhivko.taskManagement.data.entities.base.BaseEntity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "projects")
public class Project extends BaseEntity {

    @Column(name = "project_name", nullable = false, columnDefinition = "VARCHAR(100)")
    private String projectName = null;

    @ManyToOne
    @JoinColumn(name="color_id",
            nullable=false)
    private Color projectColor = null;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="user_id")
    private User user = null;

    @OneToMany(mappedBy = "project", cascade = {CascadeType.ALL})
    private List<Task> tasks = null;

    public Project() {
        this.tasks = new ArrayList<>();
    }
}
