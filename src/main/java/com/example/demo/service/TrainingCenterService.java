package com.example.demo.service;

import com.example.demo.entity.TrainingCenter;
import com.example.demo.repository.TrainingCenterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TrainingCenterService {

    @Autowired
    private TrainingCenterRepository repository;

    public TrainingCenter createTrainingCenter(TrainingCenter trainingCenter) {
        return repository.save(trainingCenter);
    }

    public List<TrainingCenter> getAllTrainingCenters() {
        return repository.findAll();
    }

    public List<TrainingCenter> getCentersByCity(String city) {
        return repository.findByAddress_City(city);
    }

    public List<TrainingCenter> getCentersByCourse(String course) {
        return repository.findByCoursesOfferedContaining(course);
    }
}
