package com.alison.mybatis;

import java.util.List;

import com.alison.pojo.Person;


//interface接口要能在憋得包中使用，必须使用public强调！！
public interface PersonMapper {
	
	public Person findPersonById(int id);
	
	public List<Person> findAll();
	
	public void addPerson(Person p);
	
}
