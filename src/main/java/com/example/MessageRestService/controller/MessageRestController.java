package com.example.MessageRestService.controller;

import java.util.ArrayList;
import java.util.List;

import com.example.MessageRestService.model.Message;
import com.example.MessageRestService.model.Conversation;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageRestController {

    Conversation messages;

    public MessageRestController() {
        messages = new Conversation();
    }

    @GetMapping("/messages")
    public Conversation getMessages() {
        return messages;
    }

    @PostMapping("/messages")
    public void addMessage(@RequestBody Message newMessage) {
        messages.addMessage(newMessage);
    }

    @DeleteMapping("/messages/{id}")
    public void deleteMessage(@PathVariable("id") long messageId) {

    }


}