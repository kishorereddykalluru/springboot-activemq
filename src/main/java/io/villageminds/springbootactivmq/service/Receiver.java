package io.villageminds.springbootactivmq.service;

import io.villageminds.springbootactivmq.domain.Email;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Receiver {

    @JmsListener(destination = "mailbox", containerFactory = "myFactory")
    public void receiver(Email email){
        System.out.println(" Received <" + email + ">");
    }
}
