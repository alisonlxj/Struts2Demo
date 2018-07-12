package com.alison.mybatis;

import java.util.List;

interface HobbyMapper {
	
	public List<String> findHobbiesByPersonId(int p_id);
	
	public void addHobbies(List<String> hobbies, int p_id);
}
