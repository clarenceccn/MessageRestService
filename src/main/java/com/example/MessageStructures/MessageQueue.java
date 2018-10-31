package com.example.MessageStructures;

import com.example.MessageRestService.model.Message;

/* Circular queue for messages that erases history when reached past capacity*/
public class MessageQueue {

    public static final int DEFAULT_SIZE = 50;

    private int size = DEFAULT_SIZE;
    private int end;
    private int front;
    private int numMessages;

    private Message[] data;

    public MessageQueue() {
        init();
    }

    public MessageQueue(int capacity) {
        size = capacity;
        init();
    }

    public void append(Message newMessage) {
        if (end >= size) {
            end = end % size; 
        }

        data[end].setData(newMessage.getData());
        data[end].setId(newMessage.getId());
        data[end++].setSender(newMessage.getSender());
    }

    public Message removeFirst() {
        return null;
    }

    private void init() {
        data = new Message[size];
        for (int i = 0; i < size; i++) {
            data[i] = new Message();
        }
    }

}