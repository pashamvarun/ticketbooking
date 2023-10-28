package com.example.moviebooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.moviebooking.model.cinemas;

public interface cinemasrepository extends JpaRepository<cinemas, Long> {

}
