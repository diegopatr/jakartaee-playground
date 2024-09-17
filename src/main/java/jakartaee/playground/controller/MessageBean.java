package jakartaee.playground.controller;

import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import jakartaee.playground.model.Message;
import jakartaee.playground.service.MessageService;

import java.util.List;

@Named
@RequestScoped
public class MessageBean {
    private Message message = new Message();
    private List<Message> messages;

    @Inject
    private MessageService messageService;

    @PostConstruct
    public void init() {
        messages = messageService.list();
    }

    public void save() {
        messageService.create(message);
        messages = messageService.list();
        message = new Message();
    }

    public List<Message> getMessages() {
        return messages;
    }

    public Message getMessage() {
        return message;
    }
}
