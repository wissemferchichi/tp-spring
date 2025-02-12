package com.tp.foyer.tp.spring.Entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Foyer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id ;
    private String nomFoyer ;

    private  int capaciteFoyer ;

    @OneToMany(mappedBy = "foyer", cascade = CascadeType.ALL )
    @JsonManagedReference
    private Set<Bloc> blocs;



@OneToOne(cascade = CascadeType.ALL)
@JoinColumn(name = "bloc_id")
private Bloc bloc;




}