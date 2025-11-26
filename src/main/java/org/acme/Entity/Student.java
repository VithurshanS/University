package org.acme.Entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Student {

    @Id
    private Long id;

    @OneToOne
    @MapsId
    @JoinColumn(name = "id")
    public User user;

    @ManyToOne
    @JoinColumn(name = "department_id")
    public Department department;

    @OneToMany(mappedBy = "student")
    public List<Enrollment> enrollments;
}
