package com.studentService.studentService.Mapper;

import com.studentService.studentService.Dto.Studentdto;
import com.studentService.studentService.Entity.Student;

public class StudentMapper {

	public static Student mapToStudent(Studentdto studentdto) {
		return new Student(
			studentdto.getId(),
			studentdto.getFirstName(),
			studentdto.getLastName(),
			studentdto.getGrade(),
			studentdto.getAge()
		);
	}

	public static Studentdto mapToStudentdto(Student student) {
		return new Studentdto(
			student.getId(),
			student.getFirstName(),
			student.getLastName(),
			student.getGrade(),
			student.getAge()
		);
	}

}
