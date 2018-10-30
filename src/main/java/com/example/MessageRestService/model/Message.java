package com.example.MessageRestService.model;

public class Message {

    public static long idCounter = 0;

    private String data;
    private long id;

    public Message() {
        this.id = idCounter++;
    }

    public long getId() {
        return this.id;
    }


    public String getMessage() {
        return this.data;
    }

    public void setMessage(String msg) {
        this.data = msg;
    }



}