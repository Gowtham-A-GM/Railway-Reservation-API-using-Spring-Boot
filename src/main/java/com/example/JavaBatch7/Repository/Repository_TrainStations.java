package com.example.JavaBatch7.Repository;

import com.example.JavaBatch7.Model.Model_TrainStations;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface Repository_TrainStations extends JpaRepository<Model_TrainStations, Long> {

    @Query("SELECT s FROM Model_TrainStations s WHERE s.stationName LIKE %:name%")
    List<Model_TrainStations> findStationsByName(String name);

}
