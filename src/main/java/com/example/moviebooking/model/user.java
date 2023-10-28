package com.example.moviebooking.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class user {
	    @Id
        @Column(name = "user_id")
	    private int id;

	    @Column(name = "user_name")
	    private String userName;

	    @Column(name = "password")
	    private String password;

	    @OneToMany(mappedBy="User",cascade = CascadeType.MERGE)
	    
	    private Set<cinemas> Cinema;

		public user() {
			super();
			
		}
		public user(int id, String userName, String password, Set<cinemas> cinema) {
			super();
			this.id = id;
			this.userName = userName;
			this.password = password;
			Cinema = cinema;
		}
        public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getUserName() {
			return userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public Set<cinemas> getCinema() {
			return Cinema;
		}

		public void setCinema(Set<cinemas> cinema) {
			Cinema = cinema;
		}

		
		

		
}
