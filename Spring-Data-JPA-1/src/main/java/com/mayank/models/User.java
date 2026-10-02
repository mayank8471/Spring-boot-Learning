package com.mayank.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

	@Id
	@Column(name ="USER_ID")
	private Integer userId;
	
	@Column(name ="USER_NAME")
	private String userName;
	
	@Column(name ="USER_GENDER")
	private String gender;
	
	@Column(name ="USER_AGE")
	private Integer age;
	
	@Column(name ="USER_COUNTRY")
	private String country;
}
