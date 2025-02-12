package com.tp.foyer.tp.spring.service;

import com.tp.foyer.tp.spring.Entity.Chambre;

import java.util.List;


public interface IChambreService {
    public List<Chambre> retrieveAllChambres();
    public Chambre retrieveChambre(Long chambreId);
    public Chambre addChambre(Chambre c);
    public void removeChambre(Long chambreId);
    public Chambre modifyChambre(Chambre chambre);
    List <Chambre> findChambreByEtudiantAndReservation(long etudiantCIN, long reservationId);

}
