package com.tp.foyer.tp.spring.service;


import com.tp.foyer.tp.spring.Entity.Foyer;
import com.tp.foyer.tp.spring.repository.FoyerRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@AllArgsConstructor
public class FoyerService implements IFoyer {
    @Autowired
    FoyerRepository FoyerRepository ;

    @Override
    public List<Foyer> findAll() {
        return FoyerRepository.findAll() ;
    }

    @Override
    public  Foyer findById(int id) {
        return FoyerRepository.findById(id).get();
    }

    @Override
    public Foyer add(Foyer  foyer) {
        return  FoyerRepository.save(foyer);
    }

    @Override
    public Foyer edit(Foyer foyer) {
        return  FoyerRepository.save(foyer);
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void delete(Foyer foyer) {
        FoyerRepository.delete(foyer);
    }

    public Foyer addFoyerAndBlocAndAssign(Foyer foyer) {
        return FoyerRepository.save(foyer);
}
        }

