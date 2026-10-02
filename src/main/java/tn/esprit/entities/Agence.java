package tn.esprit.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Agence {
    @Id
    private Long idAgence;
    private String nom;
    private String ville;
    private String adresse;
    private String telephone;

}
