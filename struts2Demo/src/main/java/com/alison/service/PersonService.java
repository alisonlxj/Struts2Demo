package com.alison.service;

import java.io.IOException;

import com.alison.dao.PersonDao;
import com.alison.pojo.Person;

public class PersonService {
	
	private PersonDao dao;
	
	public PersonService() throws IOException{
		System.out.println("进入service");
		dao = new PersonDao();
	}
	
	public void addPerson(Person p){
		dao.addPerson(p);
	}
	
}
