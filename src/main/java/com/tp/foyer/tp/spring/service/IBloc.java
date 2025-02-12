package com.tp.foyer.tp.spring.service;

import com.tp.foyer.tp.spring.Entity.Bloc;

import java.util.List;

public interface IBloc {



    List<Bloc> findAll();
    Bloc findById(int id);
    Bloc add(Bloc bloc);
    Bloc edit(Bloc bloc);


    void delete(int id);
    void delete(Bloc bloc);

}
