package com.tp.foyer.tp.spring.service;

import com.tp.foyer.tp.spring.Entity.Bloc;
import com.tp.foyer.tp.spring.repository.BlocRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@AllArgsConstructor
public class BlocService implements IBloc   {
BlocRepository blocrepository ;

    @Override
    public List<Bloc> findAll() {
        return blocrepository.findAll() ;
    }

    @Override
    public Bloc findById(int id) {
        return blocrepository.findById(id).get();
    }

    @Override
    public Bloc add(Bloc b) {
        return blocrepository.save(b);
    }

    @Override
    public Bloc edit(Bloc b) {
        return blocrepository.save(b);
    }

    @Override
    public void delete(Bloc b) {
            blocrepository.delete(b);
    }
}
