package com.algaworks.party.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Entity
public class Guest implements Serializable {

	private static final long serialVersionUID = 1L;
	
	/**
	 * define Id and GenerateValue as representative of primary key
	 */
	@Id
	@GeneratedValue(generator = "increment")
	@GenericGenerator(name = "increment", strategy = "increment")
	@Column(name = "id", updatable = false, nullable = false)
	private Long id;
	
	@Column
	private String name;
	
	@Column
	private Integer numberOfGuests;

	@Column
	private LocalDate date;
	
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

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}
}
