package com.sampaio.lms.entity.user;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "teachers")
@Getter
@Setter
@NoArgsConstructor

public class Teacher extends User{

    @Column(nullable = false, unique = true)
    private long registration;

    private String Subject;

    @OneToMany(mappedBy = "teacher")
    private List<Class> classes = new ArrayList<>();
}
