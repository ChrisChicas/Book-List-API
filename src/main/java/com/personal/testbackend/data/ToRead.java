package com.personal.testbackend.data;

import org.springframework.data.annotation.Id;


public class ToRead {
    @Id
    private String id;

    private String title;

    private Boolean readStatus;

    public ToRead(){
        super();
    }

    public ToRead(String title, Boolean readStatus){
        this.title = title;
        this.readStatus = readStatus;
    }

    public String getId(){
        return id;
    }

    public String getTitle(){
        return title;
    }

    public Boolean getReadStatus(){
        return readStatus;
    }
}
