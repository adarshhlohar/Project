package com.yogawebsite.yoga.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.yogawebsite.yoga.Entities.Trainer;
import com.yogawebsite.yoga.Services.TrainerServices;

@RestController
public class TrainerController {
    
    @Autowired
    TrainerServices tService;

    @GetMapping("/getTrainer/{tId}")
    public ResponseEntity<Trainer> getTrainer(@PathVariable("tId") int tId){
        return new ResponseEntity<Trainer>(tService.getTrainerDetail(tId),HttpStatus.OK);
    }

    @GetMapping("/getAllTrainer")
    public List<Trainer> getAllTrainerDetail(){
        return tService.getAllTrainers();
    }
}
