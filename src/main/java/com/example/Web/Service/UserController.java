package com.example.Web.Service;

import org.springframework.web.bind.annotation.GetMapping;

//import java.util.List;

//import javax.validation.Valid;

//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

//import com.example.Web.Service.UserRepository;
//import com.example.Web.Service.UserModel;

@RestController
public class UserController {
	
	//@Autowired
	//UserRepository repository;
	
	/*@GetMapping("/users")
	public List<UserModel> getAllUsers(){
		return repository.findAll();
	}
	
	@PostMapping("/users")
	public UserModel createUser(@Valid @RequestBody UserModel user) {
		return repository.save(user);
	}*/
	
	@GetMapping("/hello")
	public void printHelo() {
		System.out.println("hi bitch");
	}

}
