package com.example.moviebooking.service;

import java.util.List;

import com.example.moviebooking.model.cinemas;

public interface cinemasservice {
	List <cinemas> getAllcinemas();
    cinemas savecinemas(cinemas Cinemas);
	cinemas updatecinemas(cinemas Cinemas,long id);
	void deletecinemas(long id);
}
