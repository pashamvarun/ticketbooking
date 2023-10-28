package com.example.moviebooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.moviebooking.model.user;

public interface userrepository extends JpaRepository<user, Long>{

}
