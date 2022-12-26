package com.personal.testbackend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.personal.testbackend.data.FavoriteNum;
import com.personal.testbackend.exception.EntityNotFoundException;
import com.personal.testbackend.repository.FavoriteNumRepository;

@Service
public class FavoriteNumService {
    @Autowired
    private FavoriteNumRepository favoriteNumRepository;

    public List<FavoriteNum> getAll(){
        return favoriteNumRepository.findAll();
    }

    public FavoriteNum getById(String id){
        return favoriteNumRepository.findById(id).orElseThrow(EntityNotFoundException::new);
    }

    public FavoriteNum save(FavoriteNum favoriteNum){
        return favoriteNumRepository.save(favoriteNum);
    }

    public void deleteById(String id){
        favoriteNumRepository.deleteById(id);
    }
}
