package com.sampaio.lms.entity.user;

import com.sampaio.lms.entity.classroom.Classroom;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "alunos")
@Getter
@Setter
@NoArgsConstructor

public class Student extends User{

    @Column(nullable = false, unique = true)
    private long registration;

    @ManyToMany
    private List<Classroom> classrooms = new ArrayList<>();
}
