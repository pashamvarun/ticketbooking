package com.example.moviebooking.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.moviebooking.model.movie;
import com.example.moviebooking.service.movieservice;
@Controller
public class moviecontroller {
	private movieservice Movieservice;
    public moviecontroller(movieservice movieservice) {
		super();
		Movieservice = movieservice;
	}
    List<String> movieList;
    @ModelAttribute
    public void preLoad(Model model){
     movieList = new ArrayList<>();
     movieList.add("bahubali");
     movieList.add("KGF");
     movieList.add("RRR");
     movieList.add("KASHMIR FILES");
    }
    @RequestMapping(value="/movie",method=RequestMethod.GET)
    public String home(Model model) {
     model.addAttribute("movieList", movieList);
     return "movie";
     }
	
	@PostMapping("/movie")
	public ResponseEntity<movie>savemovie(@RequestBody movie Movie){
		return new ResponseEntity<movie>(Movieservice.savemovie(Movie),HttpStatus.CREATED );
	}
	@PutMapping("/movie/{id}")
	public movie updatemovie(@PathVariable("id")long id,@RequestBody movie Movie){
		return Movieservice.updatemovie(Movie, id);
	}
	
	@DeleteMapping("/movie/{id}")
	public ResponseEntity<movie> deletemovie(@PathVariable("id")long id){
		Movieservice.deletemovie(id);
		return new ResponseEntity<movie>(HttpStatus.OK);
	}

}
