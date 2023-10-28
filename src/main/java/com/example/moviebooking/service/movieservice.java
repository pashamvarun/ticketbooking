package com.example.moviebooking.service;

import java.util.List;

import com.example.moviebooking.model.movie;

public interface movieservice {
	List <movie> getAllmovie();
	movie savemovie(movie Movie);
	movie updatemovie(movie Movie,long id);
	void deletemovie(long id);
}
