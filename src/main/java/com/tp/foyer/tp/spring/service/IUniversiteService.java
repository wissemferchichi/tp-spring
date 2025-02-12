package com.tp.foyer.tp.spring.service;

import com.tp.foyer.tp.spring.Entity.Universite;

import java.util.List;

public interface IUniversiteService {
    List<Universite> retrieveAllUniversites();
    Universite retrieveUniversite(Long universiteId);
    Universite addUniversite(Universite universite);
    void removeUniversite(Long universiteId);
    Universite modifyUniversite(Universite universite);
}
