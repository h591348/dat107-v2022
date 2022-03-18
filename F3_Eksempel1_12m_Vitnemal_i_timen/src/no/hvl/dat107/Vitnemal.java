package no.hvl.dat107;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(schema = "forelesning3")
public class Vitnemal {

    @Id
    private int studNr;
    private LocalDate studiestart;
    private LocalDate studieslutt;


    @Override
    public String toString() {
        return "Vitnemal{" +
                "studNr=" + studNr +
                ", studiestart=" + studiestart +
                ", studieslutt=" + studieslutt +
                '}';
    }
}
