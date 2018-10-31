package com.example.MessageRestService.model;

public class Message {

    public static long idCounter = 0;

    private String data;
    private long id;
    private long userId;

    public Message() {
        this.id = idCounter++;
    }

    public long getSender() {
        return this.userId;
    }

    public void setSender(long userId) {
        this.userId = userId;
    }

    public long getId() {
        return this.id;
    }
  
    public void setId(long id) {
        this.id = id;
    }


    public String getData() {
        return this.data;
    }

    public void setData(String msg) {
        this.data = msg;
    }

}