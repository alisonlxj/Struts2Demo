package com.alison.dao;

import java.io.IOException;
import java.io.InputStream;

import com.alison.mybatis.*;
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
	
}



