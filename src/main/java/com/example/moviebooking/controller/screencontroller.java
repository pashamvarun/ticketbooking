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

import com.example.moviebooking.model.screen;
import com.example.moviebooking.service.screenservice;
@Controller
public class screencontroller {
	
	 
		private screenservice Screenservice;

		public screencontroller(screenservice screenservice) {
			super();
			Screenservice = screenservice;
		}
		List<String> screenList;
	    @ModelAttribute
	    public void preLoad(Model model){
	     screenList = new ArrayList<>();
	     screenList.add("screen 1");
	     screenList.add("screen 2");
	     
	    }
	    @RequestMapping(value="/screen",method=RequestMethod.GET)
	    public String home(Model model) {
	     model.addAttribute("screenList", screenList);
	     return "screen";
	     }
		@PostMapping("/screen")
		public ResponseEntity<screen>savescreen(@RequestBody screen Screen){
			return new ResponseEntity<screen>(Screenservice.savescreen(Screen),HttpStatus.CREATED );
		}
		@PutMapping("/screen/{id}")
		public screen updatescreen(@PathVariable("id")long id,@RequestBody screen Screen){
			return Screenservice.updatescreen(Screen, id);
		}
		
		@DeleteMapping("/screen/{id}")
		public ResponseEntity<screen> deletescreen(@PathVariable("id")long id){
			Screenservice.deletescreen(id);
			return new ResponseEntity<screen>(HttpStatus.OK);
		}

}
