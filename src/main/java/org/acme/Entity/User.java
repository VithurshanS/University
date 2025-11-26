package org.acme.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @Column(nullable = false)
    public String firstName;

    @Column(nullable = false)
    public String lastName;

    @Column(nullable = false, unique = true)
    public String username;

    @Column(nullable = false)
    public String password;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    public Role role;

    public enum Role {
        STUDENT, LECTURER, ADMIN
    }
}
