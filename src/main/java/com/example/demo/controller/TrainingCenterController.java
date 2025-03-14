package com.example.demo.controller;

import com.example.demo.entity.TrainingCenter;
import com.example.demo.service.TrainingCenterService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.logging.Logger;

@RestController
@RequestMapping("/api/training-centers")
public class TrainingCenterController {

    private static final Logger logger = Logger.getLogger(TrainingCenterController.class.getName());

    @Autowired
    private TrainingCenterService service;  // Remove direct repository usage

    @PostMapping
    public ResponseEntity<TrainingCenter> createTrainingCenter(@Valid @RequestBody TrainingCenter trainingCenter) {
        logger.info(" Received Training Center Data: " + trainingCenter.toString());
        return ResponseEntity.ok(service.createTrainingCenter(trainingCenter));
    }

    @GetMapping
    public ResponseEntity<List<TrainingCenter>> getAllTrainingCenters() {
        return ResponseEntity.ok(service.getAllTrainingCenters());
    }

    // Get centers by city
    @GetMapping("/city/{city}")
    public ResponseEntity<List<TrainingCenter>> getCentersByCity(@PathVariable String city) {
        return ResponseEntity.ok(service.getCentersByCity(city));
    }

    // Get centers by course offered
    @GetMapping("/course/{course}")
    public ResponseEntity<List<TrainingCenter>> getCentersByCourse(@PathVariable String course) {
        return ResponseEntity.ok(service.getCentersByCourse(course));
    }
}
