package com.tp.foyer.tp.spring.repository;

import com.tp.foyer.tp.spring.Entity.Bloc;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BlocRepository   extends JpaRepository<Bloc , Integer> {
 List<Bloc> findByFoyerIsNull();


 }
