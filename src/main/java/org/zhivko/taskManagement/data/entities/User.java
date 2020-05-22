package org.zhivko.taskManagement.data.entities;

import org.hibernate.annotations.Type;
import org.zhivko.taskManagement.data.entities.base.BaseEntity;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User extends BaseEntity {

    @Column(name = "username",
            nullable = false,
            unique = true,
            columnDefinition = "VARCHAR(255)")
    private String username = null;

    @Column(name = "password",
            nullable = false,
            columnDefinition = "VARCHAR(100)")
    private String password = null;

    @OneToOne(fetch = FetchType.LAZY,
            cascade = CascadeType.ALL,
            mappedBy = "user")
    private Profile profile = null;

    @Type(type= "org.hibernate.type.NumericBooleanType")
    @Column(name = "is_active", nullable = false, columnDefinition = "TINYINT(1)")
    private boolean isActive = false;

    @Type(type= "org.hibernate.type.NumericBooleanType")
    @Column(name = "is_enable", nullable = false, columnDefinition = "TINYINT(1)")
    private boolean isEnable = false;

    public User() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public boolean isEnable() {
        return isEnable;
    }

    public void setEnable(boolean enable) {
        isEnable = enable;
    }
}
