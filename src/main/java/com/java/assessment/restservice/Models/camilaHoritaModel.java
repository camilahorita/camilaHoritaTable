package com.java.assessment.restservice.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

//Model to create the table in the local database

@Entity
@Table(name = "camilaHoritaTable")
@Getter
@Setter

public class camilaHoritaModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;

}
