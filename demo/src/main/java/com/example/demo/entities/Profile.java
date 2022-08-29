package com.example.demo.entities;

import javax.persistence.*;
import java.io.Serializable;
public class Profile implements Serializable{

    //Se agrega el @id
    private static final Integer serialVersionUID = 432;
    @id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;

    //Atributos
    private String image;
    private String phone;
    private User user;
    private Date createdAt;
    private Date updatedAt;

    // Método constructor
    public Profile() {
    }

    public Profile(String image, String phone, User user, Date createdAt, Date updatedAt) {
        this.image = image;
        this.phone = phone;
        this.user = user;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    // Métodos getter and setter


    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}
