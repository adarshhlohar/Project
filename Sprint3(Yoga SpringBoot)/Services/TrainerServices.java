package com.yogawebsite.yoga.Services;


import java.util.List;
import com.yogawebsite.yoga.Entities.Trainer;

public interface TrainerServices {
    
    Trainer getTrainerDetail(int tId);

    List<Trainer> getAllTrainers();
}
