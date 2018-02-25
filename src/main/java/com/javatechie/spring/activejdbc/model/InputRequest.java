package com.javatechie.spring.activejdbc.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class InputRequest {

	private int id;
	private String firstName;
	private String lastName;
}
