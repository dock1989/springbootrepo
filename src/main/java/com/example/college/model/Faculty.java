package com.example.college.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

/**
 * The persistent class for the faculty database table.
 *
 */
@Entity
@NamedQuery(name="Faculty.findAll", query="SELECT f FROM Faculty f")
@Data
@NoArgsConstructor
@ToString
public class Faculty implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;

    @Column(name="fac_address")
    private String facAddress;

    @Column(name="fac_email")
    private String facEmail;

    @Column(name="fac_name")
    private String facName;

}