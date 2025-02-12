package com.tp.foyer.tp.spring.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Bloc {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int idBloc ;
    private String nomBloc ;

    private  int capaciteBloc ;


   @ManyToOne
    @JoinColumn(name = "foyer_id", nullable = true)
   @JsonBackReference
    private Foyer foyer;



    @OneToOne(mappedBy = "bloc")
    @ToString.Exclude
    @JsonIgnore
    private Foyer foyerUnique;




}
