package com.linelect.cnames.cnames.model;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import java.util.List;
import java.util.Set;

@Entity
public class User {

    @Id
    @GeneratedValue
    private long id;

    @Column(nullable = false, unique = true)
    @Email
    @NotEmpty
    private String email;

    @Column
    private String name;

    @Column(nullable = false)
    @NotEmpty
    private String password;

    @OneToOne
    private Language language;

    @Column
    private boolean isAdmin;

    @Column
    @Email
    private String linkedEmail;

    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    private Set<LikeName> likes;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }

    public String getLinkedEmail() {
        return linkedEmail;
    }

    public void setLinkedEmail(String linkedEmail) {
        this.linkedEmail = linkedEmail;
    }
}
