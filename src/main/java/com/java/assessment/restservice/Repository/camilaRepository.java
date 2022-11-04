package com.java.assessment.restservice.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.java.assessment.restservice.Models.camilaHoritaModel;

@Repository
public interface camilaRepository extends CrudRepository<camilaHoritaModel, Integer> {
    
}
