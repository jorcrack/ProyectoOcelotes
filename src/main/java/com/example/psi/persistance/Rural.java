package com.example.psi.persistance;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.util.Date;
import javax.persistence.*;



/**
 * Created by .
 */
@Entity
@Table(name = "Población Rural")


public class Rural {
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



    public Rural() {
    	
    }
    
    public Rural(Long _id) {
    	id=_id;
    	
    }

  
  	  

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
  	  
    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
