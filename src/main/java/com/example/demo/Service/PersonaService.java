package com.example.demo.Service;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.PersonaModel;
import com.example.demo.Repository.PersonaRepository;

@Service("personaService")
public class PersonaService {
    
    @Autowired
    private PersonaRepository userRepository;

    public ArrayList<PersonaModel> getPersonas(){
        return (ArrayList<PersonaModel>) userRepository.findAll();
    }

    public PersonaModel addPersona(PersonaModel personaModel){
        return userRepository.save(personaModel);
    }

    //Lo que hace el Optional es devolver un tipo o null
    public Optional<PersonaModel> getByIdPersona(Long id){
        return userRepository.findById(id);
    }

    public PersonaModel updateByIdPersona(PersonaModel personaModel, Long id){
        PersonaModel persona = userRepository.findById(id).get();
        persona.setNombre(personaModel.getNombre());
        persona.setEdad(personaModel.getEdad());
        return persona;
    }

    public Boolean deletePersona(Long id){
        try {
            userRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        } 
    }

}
