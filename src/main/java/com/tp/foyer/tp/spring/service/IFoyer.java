package com.tp.foyer.tp.spring.service;

import com.tp.foyer.tp.spring.Entity.Foyer;

import java.util.List;

public interface IFoyer {

    List<Foyer> findAll();
    Foyer findById(int id);
    Foyer add(Foyer b);
    Foyer edit(Foyer b);

    void delete(int id);

    void delete(Foyer foyer);
    Foyer addFoyerAndBlocAndAssign(Foyer foyer);
}



