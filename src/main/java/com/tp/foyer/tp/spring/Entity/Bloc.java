package com.tp.foyer.tp.spring.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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
    private Foyer foyer;








}
