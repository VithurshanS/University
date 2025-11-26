package org.acme.Entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @Column(nullable = false, unique = true)
    public String name;

    @OneToMany(mappedBy = "department")
    public List<Lecturer> lecturers;

    @OneToMany(mappedBy = "department")
    public List<Student> students;

    @OneToMany(mappedBy = "department")
    public List<Module> modules;
}
