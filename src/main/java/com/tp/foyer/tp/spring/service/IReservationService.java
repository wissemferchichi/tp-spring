package com.tp.foyer.tp.spring.service;

import com.tp.foyer.tp.spring.Entity.Reservation;

import java.util.List;

public interface IReservationService {
    List<Reservation> retrieveAllReservations();
    Reservation retrieveReservation(Long reservationId);
    Reservation addReservation(Reservation reservation);
    void removeReservation(Long reservationId);
    Reservation modifyReservation(Reservation reservation);

}
