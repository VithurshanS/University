package org.acme.Entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Enrollment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @ManyToOne
    @JoinColumn(name = "student_id")
    public Student student;

    @ManyToOne
    @JoinColumn(name = "module_id")
    public Module module;

    public LocalDate enrollmentDate;
}
