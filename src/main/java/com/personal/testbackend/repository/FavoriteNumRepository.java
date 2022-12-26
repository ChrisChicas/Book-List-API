package com.personal.testbackend.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.personal.testbackend.data.FavoriteNum;

public interface FavoriteNumRepository extends MongoRepository<FavoriteNum, String> {}