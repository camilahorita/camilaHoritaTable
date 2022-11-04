package com.java.assessment.restservice.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.java.assessment.restservice.Models.camilaHoritaModel;
import com.java.assessment.restservice.Models.messageModel;
import com.java.assessment.restservice.Repository.camilaRepository;

@Service
public class camilaService {

    @Autowired
    private camilaRepository cr;
    @Autowired
    private messageModel mm;

    //method to get all 
    public Iterable<camilaHoritaModel> getAll(){
        return cr.findAll();
    }

    //method to post 
    public ResponseEntity<?> post(camilaHoritaModel cm){
        
	    if(cm.getFirstName().equals("")){
        mm.setMessage("The name is required");
        return new ResponseEntity<messageModel>(mm, HttpStatus.BAD_REQUEST);
        } else if(cm.getLastName().equals("")){
        mm.setMessage("The lastname is required");
        return new ResponseEntity<messageModel>(mm, HttpStatus.BAD_REQUEST);
        } else if(cm.getEmail().equals("")){
            mm.setMessage("The email is required");
            return new ResponseEntity<messageModel>(mm, HttpStatus.BAD_REQUEST);
        } else {
        return new ResponseEntity<camilaHoritaModel>(cr.save(cm), HttpStatus.CREATED);
        }
    }

    
}
