package possacode.workshopdto.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Cotisation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private double montant;

    @ManyToOne
    @JoinColumn(name = "id_membre")
    private Membre membre;
}
