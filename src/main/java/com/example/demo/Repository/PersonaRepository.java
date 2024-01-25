package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.PersonaModel;

@Repository
public interface PersonaRepository extends JpaRepository<PersonaModel,Long>{
    
}
