package com.tp.foyer.tp.spring.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Set;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Chambre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idChambre;
    private Long numeroChambre;

    @Enumerated(EnumType.STRING)
    private TypeChambre typeC;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    @JoinColumn(name = "bloc_id")
    private Bloc bloc;

    @OneToMany( cascade = CascadeType.ALL)
    @ToString.Exclude
    @JsonIgnore
    private Set<Reservation> reservations;
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JsonIgnore
    @ToString.Exclude
    @JoinColumn(name = "etudiant_id")
    private Etudiant etudiant;


}
