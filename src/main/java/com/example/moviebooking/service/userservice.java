package com.example.moviebooking.service;

import java.util.List;

import com.example.moviebooking.model.user;

public interface userservice {
	List <user> getAlluser();
	user saveuser(user User);
	user updateuser(user User,long id);
	void deleteuser(long id);
}
