package com.studentService.studentService.Service;

import com.studentService.studentService.Dto.Studentdto;
import com.studentService.studentService.Entity.Student;
import com.studentService.studentService.Mapper.StudentMapper;
import com.studentService.studentService.Repository.studentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class studentService {

	@Autowired
	studentRepository studentrepository;
	public Studentdto createStudent(Studentdto studentdto) {
		Student student = StudentMapper.mapToStudent(studentdto);
		Student std = studentrepository.save(student);
		return StudentMapper.mapToStudentdto(std);
	}


	public List<Studentdto> getAllStudents() {
		List<Student> std = studentrepository.findAll();
		return std.stream().map(student -> StudentMapper.mapToStudentdto(student)).collect(Collectors.toList());
	}

	public Studentdto getStudentById(int id) {
		Student getStd = studentrepository.findById(id).get();
		return StudentMapper.mapToStudentdto(getStd);
	}
}
