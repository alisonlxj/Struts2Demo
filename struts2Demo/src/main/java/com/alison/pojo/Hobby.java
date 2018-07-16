package com.alison.pojo;

public class Hobby {

	private String hobby;
	private int person_id;
	
	public Hobby(){};
	public Hobby(String h, int id) {
		// TODO Auto-generated constructor stub
		this.hobby = h;
		this.person_id = id;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	public int getPerson_id() {
		return person_id;
	}
	public void setPerson_id(int person_id) {
		this.person_id = person_id;
	}
	
	
}
