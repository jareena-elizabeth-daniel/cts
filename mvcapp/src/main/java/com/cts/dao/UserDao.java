package com.cts.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.cts.model.User;
@Repository
public class UserDao {
	
	
	 List<User> list = null;
	   public List<User> getAllUsers(){
		   list = new ArrayList<User>();
		   list.add(new User(11, "name1", 33));
		   list.add(new User(12, "name2", 31));
		   list.add(new User(13, "name3", 23));
		   
		   return list;
	   }

}
