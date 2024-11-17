package com.tp.foyer.tp.spring.service;

import com.tp.foyer.tp.spring.Entity.Foyer;
import com.tp.foyer.tp.spring.repository.FoyerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor

public class FoyerService implements Ifoyer {

FoyerRepository foyerRepository ;
    @Override
    public List<Foyer> findAll() {
        return foyerRepository.findAll();
    }

    @Override
    public Foyer findById(int id) {
        return foyerRepository.findById(id).get();
    }

    @Override
    public Foyer add(Foyer b) {
        return  foyerRepository.save(b);
    }

    @Override
    public Foyer edit(Foyer b) {
        return foyerRepository.save(b);
    }

    @Override
    public void delete(int id) {
        foyerRepository.deleteById(id);
    }
}
