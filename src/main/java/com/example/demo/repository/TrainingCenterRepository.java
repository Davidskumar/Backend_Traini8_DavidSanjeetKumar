package com.example.demo.repository;

import com.example.demo.entity.TrainingCenter;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository  // Ensures Spring Boot detects this as a repository
public interface TrainingCenterRepository extends MongoRepository<TrainingCenter, String> {
    List<TrainingCenter> findByAddress_City(String city);
    List<TrainingCenter> findByCoursesOfferedContaining(String course);
}
