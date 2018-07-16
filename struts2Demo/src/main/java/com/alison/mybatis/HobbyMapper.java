package com.alison.mybatis;

import java.util.List;

import com.alison.pojo.Hobby;

public interface HobbyMapper {
	
	public List<String> findHobbiesByPersonId(int p_id);
	
	public void addHobby(Hobby hobby);
}
