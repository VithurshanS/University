package org.acme.Entity;

import jakarta.persistence.*;

@Entity
public class Admin {

    @Id
    private Long id;

    @OneToOne
    @MapsId
    @JoinColumn(name = "id")
    public User user;
}
