package com.example.moviebooking.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.moviebooking.model.cinemas;
import com.example.moviebooking.model.user;
import com.example.moviebooking.service.cinemasservice;
@Controller
public class cinemacontroller {
	private cinemasservice Cinemasservice;
	public cinemacontroller(cinemasservice cinemasservice) {
		super();
		Cinemasservice = cinemasservice;
	}
	List<String> cinemaList;
    @ModelAttribute
    public void preLoad(Model model){
     cinemaList = new ArrayList<>();
     cinemaList.add("Inox");
     cinemaList.add("Pvr");
     
    }
    @RequestMapping(value="/cinema",method=RequestMethod.GET)
    public String home(Model model) {
     model.addAttribute("cinemaList", cinemaList);
     return "cinema";
    		 }
    
	@PostMapping("/cinema")
	public ResponseEntity<cinemas>savecinemas(@RequestBody cinemas Cinemas){
		return new ResponseEntity<cinemas>(Cinemasservice.savecinemas(Cinemas),HttpStatus.CREATED );
	}
	@PutMapping("/cinema/{id}")
	public cinemas updatecinemas(@PathVariable("id")long id,@RequestBody cinemas Cinemas){
		return Cinemasservice.updatecinemas(Cinemas, id);
	}
	
	@DeleteMapping("/cinema/{id}")
	public ResponseEntity<cinemas> deletecinemas(@PathVariable("id")long id){
		Cinemasservice.deletecinemas(id);
		return new ResponseEntity<cinemas>(HttpStatus.OK);
	}

}
