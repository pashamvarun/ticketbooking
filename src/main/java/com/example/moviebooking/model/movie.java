package com.example.moviebooking.model;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "movie")
public class movie {

    @Id
   
    @Column(name = "movie_id")
    private Long id;
    @Column(name="title")
	private String title;
	@Column(name="releasedate")
	private LocalDate releaseDate;
	@Column(name="showcycle")
	private Long  showCycle;
	@ManyToOne
    private cinemas Cinemas;
	@OneToOne(cascade = CascadeType.MERGE)
    private screen Screen;
   

	public movie() {
		super();
		
	}


	public movie(Long id, String title, LocalDate releaseDate, Long showCycle, screen screen) {
		super();
		this.id = id;
		this.title = title;
		this.releaseDate = releaseDate;
		this.showCycle = showCycle;
		
		Screen = screen;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public LocalDate getReleaseDate() {
		return releaseDate;
	}


	public void setReleaseDate(LocalDate releaseDate) {
		this.releaseDate = releaseDate;
	}


	public Long getShowCycle() {
		return showCycle;
	}


	public void setShowCycle(Long showCycle) {
		this.showCycle = showCycle;
	}


	

	public screen getScreen() {
		return Screen;
	}


	public void setScreen(screen screen) {
		Screen = screen;
	}


	
	
	}


	
	


	

