package com.algaworks.party.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

@Entity
public class Guest implements Serializable {

	private static final long serialVersionUID = 1L;
	
	/**
	 * define Id and GenerateValue as representative of primary key
	 */
	@Id
	@GeneratedValue(generator = "increment")
	@GenericGenerator(name = "increment", strategy = "increment")
	private Long id;
	private String name;
	private Integer numberOfGuests;

	@Temporal(value = TemporalType.TIMESTAMP)
	private Date date;
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the numberOfGuests
	 */
	public Integer getNumberOfGuests() {
		return numberOfGuests;
	}
	/**
	 * @param numberOfGuests the numberOfGuests to set
	 */
	public void setNumberOfGuests(Integer numerOfGuests) {
		this.numberOfGuests = numerOfGuests;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
}
