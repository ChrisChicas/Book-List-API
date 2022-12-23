package com.personal.testbackend.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.personal.testbackend.data.ToRead;

public interface ToReadRepository extends MongoRepository<ToRead, String> {}