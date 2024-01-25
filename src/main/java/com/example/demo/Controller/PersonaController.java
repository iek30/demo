package com.example.demo.Controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.PersonaModel;
import com.example.demo.Service.PersonaService;

import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
@RequestMapping("/personas")

public class PersonaController {

    @Autowired
    private PersonaService personaService;

    @GetMapping
    public ArrayList<PersonaModel> getPersonas() {
        return personaService.getPersonas();
    }
    
    //Forma 1 para pasar parámetros por la url
    @PostMapping
    public PersonaModel addPersona(@RequestBody PersonaModel personaModel) {
        return personaService.addPersona(personaModel);
    }
    
    //Forma 2 para pasar parámetros por la url
    @GetMapping(path = "/{id}")
    public Optional<PersonaModel> getByIdPersona(@PathVariable("id") Long id) {
        return personaService.getByIdPersona(id);
    }
    
    @PutMapping(path = "/{id}")
    public PersonaModel updateByIdPersona(@RequestBody PersonaModel personaModel, @PathVariable("id") Long id) {
        return personaService.updateByIdPersona(personaModel, id);
    }

    @DeleteMapping(path = "/{id}")
    public Boolean deletePersona(@PathVariable("id") Long id) {
        return personaService.deletePersona(id);
    }

}
