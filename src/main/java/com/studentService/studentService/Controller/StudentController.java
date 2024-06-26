package com.studentService.studentService.Controller;

import com.studentService.studentService.Dto.Studentdto;
import com.studentService.studentService.Entity.Student;
import com.studentService.studentService.Service.studentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

	@Autowired
	studentService studentservice;

	@PostMapping("/addStudent")
	public ResponseEntity<Studentdto> createStudent(@RequestBody Studentdto studentdto){
		Studentdto student = studentservice.createStudent(studentdto);
		return new ResponseEntity<Studentdto>(student, HttpStatus.CREATED);
	}
	@GetMapping()
	public ResponseEntity<List<Studentdto>> getAllStudents(){
		List<Studentdto> getStd = studentservice.getAllStudents();
		return new ResponseEntity<>(getStd,HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Studentdto> getStudentById(@PathVariable("id") int Id){
		Studentdto getStdById = studentservice.getStudentById(Id);
		return new ResponseEntity<>(getStdById,HttpStatus.OK);
	}

}
