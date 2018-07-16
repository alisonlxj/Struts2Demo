package com.alison.struts2;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import com.alison.pojo.Hobby;
import com.alison.pojo.Person;
import com.alison.service.PersonService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class PersonAction extends ActionSupport {

	private Person person;
	private PersonService ps;
	private List<Person> people;
	private List<String> hobbies;

	/*
	 * (non-Javadoc)
	 * 展示所有人员信息
	 */
	public String listAll() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("成功到达execute action!");
		ps = new PersonService();
		people = ps.listAll();
		System.out.println("找到所有person:" + people);
		System.out.println("开始返回view页面");
		return "listAll";
	}
	
	/*
	 * 添加一名人员
	 */
	public String addPerson() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("成功到达 addPerson()  action!");
		PersonService ps = new PersonService();
		ps.addPerson(person,hobbies);
		System.out.println("数据库操作 添加person 成功");
		return "show";

	}

	public List<String> getHobbies() {
		return hobbies;
	}

	public void setHobbies(List<String> hobbies) {
		this.hobbies = hobbies;
	}

	public void setPerson(Person p){
		this.person = p;
	}
	
	public Person getPerson(){
		return person;
	}
	
	/**
	 * @return the people
	 */
	public List<Person> getPeople() {
		return people;
	}

	/**
	 * @param people the people to set
	 */
	public void setPeople(List<Person> people) {
		this.people = people;
	}
	

}
