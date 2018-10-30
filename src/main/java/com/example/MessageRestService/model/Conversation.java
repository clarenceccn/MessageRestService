package com.example.MessageRestService.model;

import java.util.ArrayList;
import java.util.List;

public class Conversation {

    private List<Message> history;

    public Conversation() {
        this.history = new ArrayList<Message>();
    }

    public List<Message> getConversation() {
        return this.history;
    }

    public void addMessage(Message msg) {
        this.history.add(msg);
    }

}