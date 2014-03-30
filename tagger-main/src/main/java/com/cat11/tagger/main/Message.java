package com.cat11.tagger.main;

import java.util.Date;

public class Message {

    private String     content;
    private final Date time;

    public Date getTime() {
        return this.time;
    }

    public Message() {
        this.time = new Date();
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(final String content) {
        this.content = content;
    }
}
