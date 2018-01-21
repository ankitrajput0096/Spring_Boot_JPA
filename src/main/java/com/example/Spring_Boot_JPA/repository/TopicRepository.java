package com.example.Spring_Boot_JPA.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Spring_Boot_JPA.model.Topic;

public interface TopicRepository extends JpaRepository<Topic,String> {

}
