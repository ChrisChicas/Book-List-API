package com.personal.testbackend.data;

import org.springframework.data.annotation.Id;

public class FavoriteNum {
    @Id
    private String id;

    private Integer favNum;

    public FavoriteNum(){
        super();
    }

    public FavoriteNum(Integer num){
        this.favNum = num;
    }

    public String getId(){
        return id;
    }

    public Integer getFavNum(){
        return favNum;
    }
}
