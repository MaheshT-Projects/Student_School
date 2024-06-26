package com.studentService.studentService.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Studentdto {
	
	private int id;
	private String firstName;
	private String lastName;
	private int grade;
	private int age;
}
