package com.alison.struts2;

import java.util.List;

import com.alison.pojo.Person;
import com.alison.service.PersonService;
import com.opensymphony.xwork2.ActionSupport;

public class ListPeopleAction extends ActionSupport{
	
	private PersonService ps;
	private List<Person> people;
	
	/* (non-Javadoc)
	 * @see com.opensymphony.xwork2.ActionSupport#execute()
	 */
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("成功到达execute action!");
		ps = new PersonService();
		people = ps.listAll();
		System.out.println("找到所有person:" + people);
		System.out.println("开始返回view页面");
		return "listAll";
	}

	public List<Person> getPeople() {
		return people;
	}

	public void setPeople(List<Person> people) {
		this.people = people;
	}
	
	
	
}
