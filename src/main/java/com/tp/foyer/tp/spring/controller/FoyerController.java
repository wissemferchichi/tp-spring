package com.tp.foyer.tp.spring.controller;


import com.tp.foyer.tp.spring.Entity.Foyer;
import com.tp.foyer.tp.spring.service.Ifoyer;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/foyer")
public class FoyerController {
Ifoyer foyerService ;

@GetMapping("/index")
    public List<Foyer> index(  ) {

         return foyerService.findAll();

    }
    @GetMapping ("/get/{id}")
    public Foyer get( @PathVariable("id") int id   ) {

      return  foyerService.findById(id);

    }

    @PostMapping("/new")
    public Foyer add(@RequestBody Foyer foyer   ) {

         Foyer foyer1 = foyerService.add(foyer);


        return foyer1 ;

    }

    @PutMapping("/edit")
    public Foyer edit(  @RequestBody Foyer foyer   ) {
        return foyerService.edit(foyer);

    }

    @DeleteMapping("/delete/{id}")
    public void delte( @PathVariable("id") int id   ) {

           foyerService.delete(id);

    }









}
