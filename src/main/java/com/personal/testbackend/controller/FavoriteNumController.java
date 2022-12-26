package com.personal.testbackend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.personal.testbackend.data.FavoriteNum;
import com.personal.testbackend.service.FavoriteNumService;

@RestController
@RequestMapping("/api/favnum")
public class FavoriteNumController {
    @Autowired
    private FavoriteNumService favoriteNumService;

    @GetMapping
    public List<FavoriteNum> getAll(){
        return favoriteNumService.getAll();
    }

    @GetMapping("/{id}")
    public FavoriteNum getById(@PathVariable String id){
        return favoriteNumService.getById(id);
    }

    @PostMapping
    public FavoriteNum create(@RequestBody FavoriteNum favoriteNum){
        return favoriteNumService.save(favoriteNum);
    }

    @PutMapping("/{id}")
    public FavoriteNum update(@RequestBody FavoriteNum favoriteNum){
        return favoriteNumService.save(favoriteNum);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id){
        favoriteNumService.deleteById(id);
    }
}
