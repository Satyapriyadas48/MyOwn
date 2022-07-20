package com.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.entity.Actor;
import com.demo.repository.ActorRepo;



@Service
public class jpaServiceImpl implements JpaService {
	
	@Autowired
	private ActorRepo actorRepo;
	
	
	@Override
	public Optional<Actor> fetchActorById(int aid) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Iterable<Actor> fetchActorsByIds(Iterable<Integer> ids) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Iterable<Actor> fetchAllActors() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public long fetchRecordsCount() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public boolean isActorAvaiable(int aid) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public String registerActor(Actor actor) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String registerActorsGroup(Iterable<Actor> list) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Actor showActorById(int aid) {
		// TODO Auto-generated method stub
		return null;
	}
	public jpaServiceImpl() {
		// TODO Auto-generated constructor stub
	}
	

}
