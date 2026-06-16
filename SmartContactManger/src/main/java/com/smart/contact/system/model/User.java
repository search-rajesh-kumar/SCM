package com.smart.contact.system.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Users")
public class User {
    @Id
    @Column
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    @Column(columnDefinition = "varchar(255) not null")
    private String name;
    @Column(columnDefinition = "varchar(255) not null")
    private String email;
    @Column(columnDefinition = "varchar(255) not null")
    private String password;
    @Column(columnDefinition = "varchar(255) not null")
    private String role;
    @Column(columnDefinition = "TINYINT(20) not null")
    private boolean enabled;
    @Column(columnDefinition = "varchar(255) not null")
    private String imageUrl;
    @Column(columnDefinition = "varchar(255) not null")
    private String about;

    public User(int id, String name, String email, String password, String role, boolean enabled, String imageUrl, String about) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.role = role;
        this.enabled = enabled;
        this.imageUrl = imageUrl;
        this.about = about;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", role='" + role + '\'' +
                ", enabled=" + enabled +
                ", imageUrl='" + imageUrl + '\'' +
                ", about='" + about + '\'' +
                '}';
    }
}
