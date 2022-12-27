package com.personal.booklist.controller;

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

import com.personal.booklist.data.ToRead;
import com.personal.booklist.service.ToReadService;

@RestController
@RequestMapping("/api/toread")
public class ToReadController {
    @Autowired
    private ToReadService toReadService;

    @GetMapping
    public List<ToRead> getAll(){
        return toReadService.getAll();
    }

    @GetMapping("/{id}")
    public ToRead getById(@PathVariable String id){
        return toReadService.getById(id);
    }

    @PostMapping
    public ToRead create(@RequestBody ToRead toRead){
        return toReadService.save(toRead);
    }

    @PutMapping("/{id}")
    public ToRead update(@RequestBody ToRead toRead){
        return toReadService.save(toRead);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable String id){
        toReadService.deleteById(id);
    }
}

