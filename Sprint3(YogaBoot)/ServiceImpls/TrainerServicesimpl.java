package com.yogawebsite.yoga.ServiceImpls;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yogawebsite.yoga.Entities.Trainer;
import com.yogawebsite.yoga.Exception.TrainerNotFoundException;
import com.yogawebsite.yoga.Reposistories.TrainerRepository;
import com.yogawebsite.yoga.Services.TrainerServices;

@Service
public class TrainerServicesimpl implements TrainerServices{

    @Autowired
    TrainerRepository tRepo;

    @Override
    public Trainer getTrainerDetail(int tId) {
        return tRepo.findById(tId).orElseThrow(()-> new TrainerNotFoundException("Trainer Id is Not found"));
    }

    @Override
    public List<Trainer> getAllTrainers() {
        return tRepo.findAll();
    }
    
}
