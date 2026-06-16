package com.smart.contact.system.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Contacts")
public class Contact {

    @Id
    @Column
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int cId;
    @Column(columnDefinition = "varchar(255) not null")
    private String name;
    @Column(columnDefinition = "varchar(255) not null")
    private String secondName;
    @Column(columnDefinition = "varchar(255) not null")
    private String work;
    @Column(columnDefinition = "varchar(255) not null")
    private String email;
    @Column(columnDefinition = "varchar(255) not null")
    private String phone;
    @Column(columnDefinition = "varchar(255) not null")
    private String imageUrl;
    @Column(columnDefinition = "varchar(255) not null")
    private String description;

    public Contact(int cId, String name, String secondName, String work, String email, String phone, String imageUrl, String description) {
        this.cId = cId;
        this.name = name;
        this.secondName = secondName;
        this.work = work;
        this.email = email;
        this.phone = phone;
        this.imageUrl = imageUrl;
        this.description = description;
    }

    public int getcId() {
        return cId;
    }

    public void setcId(int cId) {
        this.cId = cId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "cId=" + cId +
                ", name='" + name + '\'' +
                ", secondName='" + secondName + '\'' +
                ", work='" + work + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
