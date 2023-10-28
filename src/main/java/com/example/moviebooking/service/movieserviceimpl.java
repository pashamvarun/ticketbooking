package com.example.moviebooking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.moviebooking.model.movie;
import com.example.moviebooking.repository.movierepository;
@Service
public class movieserviceimpl implements movieservice {
	@Autowired
	private movierepository Movierepository;
		
		public movieserviceimpl(movierepository movierepository) {
		super();
		Movierepository = movierepository;
	}

		@Override
		public List<movie> getAllmovie() {
			return Movierepository.findAll();
		}

		@Override
		public movie savemovie(movie Movie) {
			return Movierepository.save(Movie);
		}

		@Override
		public movie updatemovie(movie Movie, long id) {
			return Movierepository.save(Movie);
		
		}

		@Override
		public void deletemovie(long id) {
			Movierepository.deleteById(id);
			
		}

}
