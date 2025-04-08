package com.train.controller;

import com.train.entity.Train;
import com.train.service.TrainService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/train")
public class TrainController {

    private TrainService trainService;

    public TrainController(TrainService trainService){
        this.trainService=trainService;
    }

    @GetMapping("/all")
    public List<Train> getAllTrain(){
        return trainService.getAllTrain();
    }

    @PostMapping("/add")
    public Train addTrain(@RequestBody Train train){
       return trainService.addTrain(train);
    }
}
