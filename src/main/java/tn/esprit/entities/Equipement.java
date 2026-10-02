package tn.esprit.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Equipement {
    @Id
    private Long idEquipement;
    private String libelle;
}