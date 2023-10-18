package com.springboot.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Users { 
	 @Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	 int id;
	 String name;
	 String pass;
	 String mobile;
	

}
