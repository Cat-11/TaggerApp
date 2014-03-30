package com.cat11.tagger.main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Tagger {

    @RequestMapping("/status")
    @ResponseBody
    public String status() {
        return "Tagger server is up and running.";
    }
}