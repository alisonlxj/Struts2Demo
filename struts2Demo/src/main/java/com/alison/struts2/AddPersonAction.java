package com.alison.struts2;

import com.alison.pojo.Person;
import com.alison.service.PersonService;
import com.opensymphony.xwork2.ActionSupport;

public class AddPersonAction extends ActionSupport{
	
	private int id;
	private String name;
	private int age;
	private int birthday;
	private String address;
	
	private Person person;
	private PersonService ps;
	
	/* (non-Javadoc)
	 * @see com.opensymphony.xwork2.ActionSupport#execute()
	 */
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("成功到达action!");
		person = fillPerson();
		PersonService ps = new PersonService();
		ps.addPerson(person);
		return "show";
		
	}
	
	
	private Person fillPerson(){
		Person p = new Person();
		p.setAddress(address);
		p.setAge(age);
		p.setBirthday(birthday);
		p.setName(name);
		p.setId(id);
		System.out.println("成功填充person："+p);
		return p;
	}
	
	

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return the birthday
	 */
	public int getBirthday() {
		return birthday;
	}

	/**
	 * @param birthday the birthday to set
	 */
	public void setBirthday(int birthday) {
		this.birthday = birthday;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
