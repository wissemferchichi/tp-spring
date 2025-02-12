package com.tp.foyer.tp.spring.repository;

import com.tp.foyer.tp.spring.Entity.Universite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UniversiteRepository extends JpaRepository<Universite,Long> {

}
