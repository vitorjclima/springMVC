package com.algaworks.party.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import org.hibernate.annotations.GenericGenerator;

@Entity
public class Person implements Serializable {

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

}
