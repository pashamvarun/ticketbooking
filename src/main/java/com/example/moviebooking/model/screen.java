package com.example.moviebooking.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "screen")
public class screen {
	 @Id
	   
	    @Column(name = "screen_id")
	    private Long id;
	    @Column(name="type")
		private String type;
	    
		public screen() {
			super();
			
		}
		public screen(Long id, String type) {
			super();
			this.id = id;
			this.type = type;
			
		}
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
		}
		
		
	
}
