package tech.herbidev.subjectgroup.models;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public  class Students implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(nullable = false, updatable = false)
	private Long id;
	private String firstName;
	private String lastName;
	
	// defaut constructor 
	public Students() {}
	
	// constructor with arguments
	public Students(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	/*Getters*/
	public Long getId() {
		return id;
	}
	public String getFirstName() {
		return firstName;
	}
	
	/*Setters*/
	public void setId(Long id) {
		this.id = id;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	@Override
	public String toString() {
		return "Etudiant{" +
				"id= " + id +
				", Prénom= " + firstName + '\'' +
				", Nome= " + lastName + '\'' +
				'}';
	}

}


