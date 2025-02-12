package com.tp.foyer.tp.spring.service;

import com.tp.foyer.tp.spring.Entity.Reservation;
import com.tp.foyer.tp.spring.repository.ReservationRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.List;

import java.util.Date;

@Service
@AllArgsConstructor
@Slf4j

public class ReservationService implements IReservationService {

    private final ReservationRepository reservationRepository;

    @Override
    public List<Reservation> retrieveAllReservations() {
        return reservationRepository.findAll();
    }

    @Override
    public Reservation retrieveReservation(Long reservationId) {
        return reservationRepository.findById(reservationId).orElse(null);
    }

    @Override
    public Reservation addReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    @Override
    public void removeReservation(Long reservationId) {
        reservationRepository.deleteById(reservationId);
    }

    @Override
    public Reservation modifyReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    @Scheduled(fixedRate = 50000)
    //@Scheduled(cron = "*/50 * * * * *")
    public void mettreAJourEtAfficherReservations() {
        Date cutoffDate = Date.from(LocalDate.of(2024, 1, 1).atStartOfDay(ZoneId.systemDefault()).toInstant());
        List<Reservation> reservations = reservationRepository.findAll();

        for (Reservation reservation : reservations) {
            if (reservation.getAnneeUniversitaire().before(cutoffDate)) {
                reservation.setEstValide(false);
                reservationRepository.save(reservation);
            }
        }

        log.info("Updated Reservations: {}", reservations);
    }


}
