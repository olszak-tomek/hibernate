package model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


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

    private double wzrost;
    private int age;

    private boolean alive; // nie isAlive

    public double getHeight() {
        return this.wzrost;
    }
    // lombok jeśli wygeneruje metodę na podstawie pola isAlive, to nazywać się będzie "isIsAlive"
    // isAlive
}