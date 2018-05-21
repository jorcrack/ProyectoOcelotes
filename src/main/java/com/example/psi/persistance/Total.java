package com.example.psi.persistance;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;


@Entity
@Table(name = "Población Total")
public class Total {
	@Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  private Long id;
	
	




	@JsonSerialize
  	  @JsonFormat(pattern = "yyyy-MM-dd")
  	  @Column(name="DATE")
  	  @Temporal(TemporalType.TIMESTAMP)
  	  private Date date;
  	  
  	  @Column(name="VALUE")
  	  private int value;

  	  private int year;

  	public int getYear() {
  		return year;
  	}



  	public void setYear(int year) {
  		this.year = year;
  	}

  	
  	public Date getDate() {
  		return date;
  	}

  	public void setDate(Date date) {
  		this.date = date;
  	}

  	public int getValue() {
  		return value;
  	}

  	public void setValue(int value) {
  		this.value = value;
  	}
  	  



	  private Rural rural;

	 
	public Rural getRural() {
		return rural;
	}

	public void setRural(Rural rural) {
		this.rural = rural;
	}
	
	  public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}


} 
	  

