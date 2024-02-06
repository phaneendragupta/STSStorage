package com.bezkoder.spring.jpa.h2.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "Speakers")
public class Speaker{
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long speaker_id;
  


	private Long first_name;
	private Long last_name;
	private Long title;
	private Long company;
	private Long speaker_bio;


	public Speaker() {
		
		
	
	}


	public Long getFirst_name() {
		return first_name;
	}


	public void setFirst_name(Long first_name) {
		this.first_name = first_name;
	}


	public Long getLast_name() {
		return last_name;
	}


	public void setLast_name(Long last_name) {
		this.last_name = last_name;
	}


	public Long getTitle() {
		return title;
	}


	public void setTitle(Long title) {
		this.title = title;
	}


	public Long getCompany() {
		return company;
	}


	public void setCompany(Long company) {
		this.company = company;
	}


	public Long getSpeaker_bio() {
		return speaker_bio;
	}


	public void setSpeaker_bio(Long speaker_bio) {
		this.speaker_bio = speaker_bio;
	}

}