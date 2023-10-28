package com.example.moviebooking.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.moviebooking.model.user;
import com.example.moviebooking.repository.userrepository;
@Service
@Transactional
public class userserviceimpl implements userservice {
	@Autowired
	private userrepository Userrepository;

	public userserviceimpl(userrepository userrepository) {
		super();
		Userrepository = userrepository;
	}

	@Override
	public List<user> getAlluser() {
		return Userrepository.findAll();
	}

	@Override
	public user saveuser(user User) {
		return Userrepository.save(User);
	}

	@Override
	public user updateuser(user User, long id) {
		
		return Userrepository.save(User);
	}

	@Override
	public void deleteuser(long id) {
		Userrepository.deleteById(id);
		
	}
}
