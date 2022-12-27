package com.personal.booklist.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.personal.booklist.data.ToRead;

public interface ToReadRepository extends MongoRepository<ToRead, String> {}