package org.acme.Entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Module {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @Column(nullable = false)
    public String name;

    public String code;
    public Integer credits;
    public Integer hours;

    @ManyToOne
    @JoinColumn(name = "department_id")
    public Department department;

    @ManyToOne
    @JoinColumn(name = "lecturer_id")
    public Lecturer lecturer;

    @ManyToOne
    @JoinColumn(name = "created_by")
    public User createdBy;

    @OneToMany(mappedBy = "module")
    public List<Enrollment> enrollments;
}
