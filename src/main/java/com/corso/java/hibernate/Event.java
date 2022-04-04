package com.corso.java.hibernate;

import java.util.Date;

public class Event {
    private Long id;
    private Date date;
    private String title, description;

    public Event(String title, String description, Date date){
        this.title = title;
        this.description = description;
        this.date = date;
    }

    public Event(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String descrition) {
        this.description = descrition;
    }
}
