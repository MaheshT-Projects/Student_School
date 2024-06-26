package com.studentService.studentService.Mapper;

import com.studentService.studentService.Dto.Schooldto;
import com.studentService.studentService.Entity.School;

public class SchoolMapper {

    public static Schooldto mapToSchoolDto(School school){
        return new Schooldto(
                school.getId(),
                school.getSchoolName(),
                school.getEmail(),
                school.getAddress()
        );
    }

    public static School mapToSchool(Schooldto schooldto){
        return new School(
                schooldto.getId(),
                schooldto.getSchoolName(),
                schooldto.getEmail(),
                schooldto.getAddress()
        );
    }
}
