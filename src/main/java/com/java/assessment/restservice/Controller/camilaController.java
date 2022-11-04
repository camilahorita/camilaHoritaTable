package com.java.assessment.restservice.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.java.assessment.restservice.Models.camilaHoritaModel;
import com.java.assessment.restservice.Service.camilaService;

@RestController
public class camilaController {

    @Autowired
    private camilaService cs;

    @GetMapping("/")
    public String route(){
        return "API funcionando";   
    }

    @GetMapping("/list")
    public Iterable<camilaHoritaModel> getAll(){
        return cs.getAll();
    }

    @PostMapping("/post")
    public ResponseEntity<?> post(@RequestBody camilaHoritaModel cm){
        return cs.post(cm);
    }
    
}
