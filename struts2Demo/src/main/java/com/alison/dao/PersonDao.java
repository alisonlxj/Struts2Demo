package com.alison.dao;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import com.alison.mybatis.*;
import com.alison.pojo.Hobby;
import com.alison.pojo.Person;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class PersonDao {
		
	private SqlSessionFactory ssf;
	
	public PersonDao() throws IOException{
		InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
		ssf = new SqlSessionFactoryBuilder().build(is);
		System.out.println("成功创建SqlSessionFactory"+ssf);
	}
	
	public void addPerson(Person p){
		SqlSession session = ssf.openSession();
		PersonMapper mapper = session.getMapper(PersonMapper.class);
		System.out.println(1111);
		mapper.addPerson(p);
		System.out.println("调用mapper添加人员成功");
	}
	
	public List<Person> listAll(){
		SqlSession session = ssf.openSession();
		PersonMapper mapper = session.getMapper(PersonMapper.class);
		return mapper.findAll();
	}

	public void addHobby(Hobby h, int id) {
		// TODO Auto-generated method stub
		SqlSession session = ssf.openSession();
		PersonMapper mapper = session.getMapper(PersonMapper.class);
		
//		return mapper.findAll();
	}
	
}



