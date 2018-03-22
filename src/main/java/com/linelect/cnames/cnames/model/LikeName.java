package com.linelect.cnames.cnames.model;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity
public class LikeName {

    @Id
    @GeneratedValue
    private long id;

    @ManyToOne
    @NotEmpty
    private User user;

    @ManyToOne
    @NotEmpty
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
