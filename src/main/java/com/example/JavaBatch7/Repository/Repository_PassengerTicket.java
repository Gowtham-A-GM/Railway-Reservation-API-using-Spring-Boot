package com.example.JavaBatch7.Repository;

import com.example.JavaBatch7.Model.Model_PassengerTicket;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public interface Repository_PassengerTicket extends JpaRepository<Model_PassengerTicket, Long> {

    @Query("SELECT CASE " +
            "WHEN p.type = 'First Class' THEN :baseFare * 1.5 " +
            "WHEN p.type = 'Second Class' THEN :baseFare " +
            "WHEN p.type = 'Sleeper' THEN :baseFare * 0.75 " +
            "END " +
            "FROM Model_PassengerTicket p WHERE p.sno = :sno")
    BigDecimal calculateFare(long sno, BigDecimal baseFare);

    @Transactional
    @Modifying
    @Query("DELETE FROM Model_PassengerTicket p WHERE p.sno = :sno")
    void cancelTicket(long sno);

    @Query("SELECT COUNT(p) > :frequentTimes FROM Model_PassengerTicket p WHERE p.id = :id ")
    boolean isFrequentTraveler(long id, long frequentTimes);
}
