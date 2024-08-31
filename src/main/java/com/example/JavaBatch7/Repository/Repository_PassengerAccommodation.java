package com.example.JavaBatch7.Repository;

import com.example.JavaBatch7.Model.Model_PassengerAccommodation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.math.BigDecimal;
import java.util.List;

public interface Repository_PassengerAccommodation extends JpaRepository<Model_PassengerAccommodation, Long> {
    List<Model_PassengerAccommodation> findAllById(long id);
}
