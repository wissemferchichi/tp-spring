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
IBloc ibloc ;


    @GetMapping("/index")
 public List<Bloc>  index() {
     return ibloc.findAll() ;

 }

    @PutMapping("/new")
    public Bloc add(@RequestBody Bloc b   ) {
        return ibloc.add(b);

    }




    @PutMapping("/edit")
    public Bloc  edit( @RequestBody Bloc bloc) {

        return ibloc.edit(bloc) ;

    }

    @DeleteMapping("/delete")
    public void   delete(@RequestBody Bloc bloc) {
          ibloc.delete(bloc) ;
    }












}
