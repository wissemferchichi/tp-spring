package com.tp.foyer.tp.spring.repository;

import com.tp.foyer.tp.spring.Entity.Chambre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ChambreRepository extends JpaRepository<Chambre,Long> {
    @Query("SELECT c FROM Chambre c JOIN c.reservations r JOIN r.etudiants e WHERE e.cin = :etudiantCIN AND r.id = :reservationId")
    List<Chambre> findChambreByEtudiantAndReservation(@Param("etudiantCIN") long etudiantCIN, @Param("reservationId") Long reservationId);
}
