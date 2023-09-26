package com.yogawebsite.yoga.Reposistories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yogawebsite.yoga.Entities.Trainer;

public interface TrainerRepository extends JpaRepository<Trainer,Integer>{
    
}
