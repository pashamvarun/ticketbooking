package com.example.moviebooking.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name = "cinemas")
public class cinemas {
	@Id
	 
	    @Column(name = "cinemas_id")
	    private Long id;

	    @Column(name = "name")
	    private String name;
	    @ManyToOne
	     private user User;
	    @OneToMany(mappedBy="Cinemas",cascade = CascadeType.MERGE)
	    private Set<movie> Movie;
	    
	    public cinemas() {
			super();
			}
	    public cinemas(Long id, String name, Set<movie> movie) {
			super();
			this.id = id;
			this.name = name;
			
			Movie = movie;
		}


		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Set<movie> getMovie() {
			return Movie;
		}
        public void setMovie(Set<movie> movie) {
			Movie = movie;
		}
	    

		
}