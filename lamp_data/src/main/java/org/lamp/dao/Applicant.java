package org.lamp.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Applicant")
public class Applicant {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private long applicantId;
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name ="last_name")
	private String lastName;
	
	@Column(name="phone_number")
	private int phoneNumber;
	
	@Column(name="email")
	private String email;	
	
	@Column(name="gender")
	private String gender;
	
	@Column(name="age")
	private int age;

	
}
