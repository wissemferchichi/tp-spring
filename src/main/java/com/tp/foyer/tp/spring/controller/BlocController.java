package com.tp.foyer.tp.spring.controller;

import com.tp.foyer.tp.spring.Entity.Bloc;
import com.tp.foyer.tp.spring.service.IBloc;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@AllArgsConstructor
@RequestMapping("/bloc")
public class BlocController {
IBloc blocService ;


    @GetMapping("/index")
 public List<Bloc>  index() {
     return blocService.findAll() ;

 }

    @PostMapping("/new")
    public Bloc add(@RequestBody Bloc bloc  ) {
        Bloc blocA = blocService.add(bloc);
        return blocA;

    }

    @PutMapping("/edit")
    public Bloc  edit( @RequestBody Bloc bloc) {

        return blocService.edit(bloc) ;

    }

    @DeleteMapping("/delete")
    public void   delete(@RequestBody Bloc bloc) {
          blocService.delete(bloc) ;
    }









    @DeleteMapping("/delete/{id}")
    public void delete( @PathVariable("id") int id   ) {

        blocService. delete(id);

    }













}
