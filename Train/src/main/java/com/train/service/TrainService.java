package com.train.service;

import com.train.entity.Train;
import com.train.repo.TrainRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrainService {

    private TrainRepository trainRepository;
   public TrainService(TrainRepository trainRepository){
        this.trainRepository=trainRepository;
    }

    public List<Train> getAllTrain() {
        return trainRepository.findAll();
    }

    public Train addTrain(Train train) {
       return trainRepository.save(train);
    }
}
