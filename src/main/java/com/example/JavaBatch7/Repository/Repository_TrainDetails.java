package com.example.JavaBatch7.Repository;

import com.example.JavaBatch7.Model.Model_TrainDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDateTime;

public interface Repository_TrainDetails extends JpaRepository<Model_TrainDetails, Long> {

}
