package com.cat11.tagger.main;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Tagger {

    private static final List<Message> messages = new ArrayList<Message>();

    @RequestMapping("/status")
    @ResponseBody
    public String status() {
        return "Tagger server is up and running.";
    }

    @RequestMapping(value = "/messages", method = RequestMethod.GET)
    @ResponseBody
    public List<Message> messages() {
        return messages;
    }

    @RequestMapping(value = "/messages", method = RequestMethod.POST, consumes = "application/json")
    @ResponseBody
    public
            Message publishMessage(@RequestBody final Message message) {
        messages.add(message);
        return message;
    }

}