package com.tp.foyer.tp.spring.service;

import com.tp.foyer.tp.spring.Entity.Chambre;
import com.tp.foyer.tp.spring.repository.ChambreRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class ChambreService implements IChambreService {
    ChambreRepository chambreRepository;
    public List<Chambre> retrieveAllChambres() {
        return chambreRepository.findAll();
    }
    public Chambre retrieveChambre(Long chambreId) {
        return chambreRepository.findById(chambreId).get();
    }
    public Chambre addChambre(Chambre c) {
        return chambreRepository.save(c);
    }
    public void removeChambre(Long chambreId) {
        chambreRepository.deleteById(chambreId);
    }
    public Chambre modifyChambre(Chambre chambre) {
        return chambreRepository.save(chambre);
    }
    public List <Chambre> findChambreByEtudiantAndReservation(long etudiantCIN, long reservationId){
        return chambreRepository.findChambreByEtudiantAndReservation(etudiantCIN, reservationId);
    }
}
