package com.tp.foyer.tp.spring.service;

import com.tp.foyer.tp.spring.Entity.Bloc;
import com.tp.foyer.tp.spring.repository.BlocRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BlocService implements IBloc {

    private final BlocRepository blocRepository;

    // Récupérer tous les blocs
    @Override
    public List<Bloc> findAll() {
        return blocRepository.findAll();
    }

    // Trouver un bloc par ID
    @Override
    public Bloc findById(int id) {
        return blocRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Bloc avec ID " + id + " non trouvé"));
    }

    // Ajouter un nouveau bloc
    @Override
    public Bloc add(Bloc bloc) {
        return blocRepository.save(bloc);
    }

    // Modifier un bloc existant
    @Override
    public Bloc edit(Bloc bloc) {
        if (blocRepository.existsById(bloc.getIdBloc())) {
            return blocRepository.save(bloc);
        } else {
            throw new RuntimeException("Bloc avec ID " + bloc.getIdBloc() + " non trouvé pour modification");
        }
    }

    // Supprimer un bloc (par entité)
    @Override
    public void delete(Bloc bloc) {
        blocRepository.delete(bloc);
    }

    // Supprimer un bloc (par ID)
    public void delete(int id) {
        if (blocRepository.existsById(id)) {
            blocRepository.deleteById(id);
        } else {
            throw new RuntimeException("Bloc avec ID " + id + " non trouvé pour suppression");
        }
    }

    // Trouver les blocs non affectés à un foyer
    public List<Bloc> findUnassignedBlocs() {
        return blocRepository.findByFoyerIsNull();
    }
}
