package com.example.moviebooking.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.moviebooking.model.user;
import com.example.moviebooking.service.userservice;
@Controller
public class usercontroller {
	
	private userservice Userservice;

	public usercontroller(userservice userservice) {
		super();
		Userservice = userservice;
	}
	
	@GetMapping("/user")
	public  List<user> getAlluser(){
		return Userservice.getAlluser();
		}
	@PostMapping("/user")
	public ResponseEntity<user>saveuser(@RequestBody user User){
		return new ResponseEntity<user>(Userservice.saveuser(User),HttpStatus.CREATED );
	}
	@PutMapping("/user/{id}")
	public user updateuser(@PathVariable("id")long id,@RequestBody user User){
		return Userservice.updateuser(User, id);
	}
	
	@DeleteMapping("/user/{id}")
	public ResponseEntity<user> deleteuser(@PathVariable("id")long id){
		Userservice.deleteuser(id);
		return new ResponseEntity<user>(HttpStatus.OK);
	}

}
