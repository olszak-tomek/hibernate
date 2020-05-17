package com.sda.javawro27.hibernate.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Data
@Entity // jest to klasa bazodanowa (UWAGA, nie zapomnij o pliku cfg.xml)
@Builder
@NoArgsConstructor
@AllArgsConstructor


public class Student {

    @Id
    @GeneratedValue()
    private Long id;

    private String firstName;
    private String lastName;
    private double height;
    private int age;


    private boolean alive; // nie isAlive

    @Enumerated(value = EnumType.STRING)
    private Behaviour behaviour;
}