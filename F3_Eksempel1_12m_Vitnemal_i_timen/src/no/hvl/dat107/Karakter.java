package no.hvl.dat107;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(schema = "forelesning3")
public class Karakter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int karNr;
    private String emnekode;
    private LocalDate eksDato;
    private String bokstav;

   // private int studNr;

    @ManyToOne
    @JoinColumn(name = "StudNr", referencedColumnName = "StudNr")
    private Vitnemal vitnemal;

    @Override
    public String toString() {
        return "Karakter{" +
                "karNr=" + karNr +
                ", emnekode='" + emnekode + '\'' +
                ", eksDato=" + eksDato +
                ", bokstav='" + bokstav + '\'' +
                ", vitnemal=" + vitnemal +
                '}';
    }
}
