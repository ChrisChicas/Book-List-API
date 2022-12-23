package com.personal.testbackend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.personal.testbackend.repository.ToReadRepository;
import com.personal.testbackend.data.ToRead;
import com.personal.testbackend.exception.EntityNotFoundException;

@Service
public class ToReadService {
    
    @Autowired
    private ToReadRepository toReadRepository;

    public List<ToRead> getAll(){
        return toReadRepository.findAll();
    }

    public ToRead getById(String id){
        return toReadRepository.findById(id).orElseThrow(EntityNotFoundException::new);
    }

    public ToRead save(ToRead toRead){
        return toReadRepository.save(toRead);
    }

    public void deleteById(String id){
        toReadRepository.deleteById(id);
    }
}
