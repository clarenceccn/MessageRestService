package com.example.MessageRestService.model;

import java.util.ArrayList;
import java.util.List;

public class Conversation {

    private int messageCount;
    private List<Message> history;

    public Conversation() {
        this.history = new ArrayList<Message>();
        messageCount = 0;
    }

    public List<Message> getConversation() {
        return this.history;
    }

    public void addMessage(Message msg) {
        this.history.add(msg);
        messageCount++;
    }

    public int getNumberOfMessages() {
        return messageCount;
    }
    
    public void deleteById(long id) {
        history.remove((int) id);
    }

    public void deleteLast() {
        history.remove(messageCount - 1);
    }

}