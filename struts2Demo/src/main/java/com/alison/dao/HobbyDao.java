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

public class HobbyDao {
		
	private SqlSessionFactory hssf;
	
	public HobbyDao() throws IOException{
		InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
		hssf = new SqlSessionFactoryBuilder().build(is);
		System.out.println("成功创建hobby_SqlSessionFactory"+hssf);
	}
	

	public void addHobby(Hobby h) {
		// TODO Auto-generated method stub
		SqlSession session = hssf.openSession();
		HobbyMapper mapper = session.getMapper(HobbyMapper.class);
		mapper.addHobby(h);
//		return mapper.findAll();
	}
	
}



