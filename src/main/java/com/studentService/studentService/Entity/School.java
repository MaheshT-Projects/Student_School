package com.studentService.studentService.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@AllArgsConstructor
public class School {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String schoolName;
    private String email;
    private String address;


    public School() {
    }

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "school_fk",referencedColumnName = "id")
    private Student student;

    public School(int id, String schoolName, String email, String address) {
    }
}
