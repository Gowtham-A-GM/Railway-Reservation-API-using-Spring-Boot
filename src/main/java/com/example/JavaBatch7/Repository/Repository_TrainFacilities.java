package com.example.JavaBatch7.Repository;

import com.example.JavaBatch7.Model.Model_TrainFacilities;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface Repository_TrainFacilities extends JpaRepository<Model_TrainFacilities, Long> {

    @Query("SELECT (f.seats - COUNT(p.sno)) " +
            "FROM Model_TrainFacilities f JOIN Model_PassengerTicket p ON f.trainNumber = p.tno " +
            "WHERE f.trainNumber = :trainNumber")
    long isSeatAvailable(long trainNumber);
}
