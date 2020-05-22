package org.zhivko.taskManagement.data.entities;

import org.zhivko.taskManagement.data.entities.base.BaseEntity;

import javax.persistence.*;

@Entity
@Table(name = "profiles")
public class Profile extends BaseEntity {

    @Column(name = "fist_name", columnDefinition = "VARCHAR(255) DEFAULT ''")
    private String firstName = null;

    @Column(name = "middle_name", columnDefinition = "VARCHAR(255) DEFAULT ''")
    private String middleName = null;

    @Column(name = "last_name", columnDefinition = "VARCHAR(255) DEFAULT ''")
    private String lastName = null;

    @Column(name = "location", columnDefinition = "VARCHAR(255) DEFAULT ''")
    private String location = null;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id",
            nullable = false)
    private User user = null;

    public Profile() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
