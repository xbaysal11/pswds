package com.baisalbek.pswds.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Item {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String title;
    private String userName;
    private String password;
    private String link;


    public Item() {}

    public Item(String title, String userName, String password, String link) {
        this.title = title;
        this.userName = userName;
        this.password = password;
        this.link = link;

    }

    @Override
    public String toString() {
        return String.format(
                "Item[id=%d, title='%s', userName='%s',  password='%s',  link='%s']",
                id, title,  userName, password, link) ;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
        return;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
        return;
    }
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
        return;
    }
    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
        return;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
        return;
    }


}