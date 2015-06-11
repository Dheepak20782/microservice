package com.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.cassandra.core.CassandraOperations;
import org.springframework.data.cassandra.core.CassandraTemplate;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;


import com.test.repository.Users;


@RestController
public class SpringBootController {
	

	@Autowired
	private CassandraOperations operations;


    @RequestMapping("/")
    public String index() {
    	
    	
    	//List<UserEntity> entities= cassandraRepository.findAll();
    	if(operations != null){

   	    Users user = new Users("Kumar","Dheepak",32,"Dheepak.kumar@gmail.com","FL");
    	operations.insert(user);

    	List<Users> users = operations.select("select * from users", Users.class);
    	
    	System.out.println("entity"+users);
    	}
        return "Welcome to Spring Boot!";
    }

}