package com.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.entity.Actor;


public interface ActorRepo extends JpaRepository<Actor, Integer>{

}
