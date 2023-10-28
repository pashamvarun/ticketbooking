package com.example.moviebooking.service;

import java.util.List;

import com.example.moviebooking.model.screen;

public interface screenservice {
	List <screen> getAllscreen();
    screen savescreen(screen Screen);
	screen updatescreen(screen Screen,long id);
	void deletescreen(long id);
}
