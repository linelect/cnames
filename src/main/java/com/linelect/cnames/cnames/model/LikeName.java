package com.linelect.cnames.cnames.model;

import javax.persistence.*;

@Entity
public class LikeName {

    @Id
    @GeneratedValue
    private long id;

    @ManyToOne
    private User user;

    @ManyToOne
    private FirstName firstName;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public FirstName getFirstName() {
        return firstName;
    }

    public void setFirstName(FirstName firstName) {
        this.firstName = firstName;
    }
}
