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

    public String getData() {
        return this.data;
    }

    public void setData(String msg) {
        this.data = msg;
    }



}