package com.example.moviebooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.moviebooking.model.movie;

public interface movierepository extends JpaRepository<movie, Long>{

}
