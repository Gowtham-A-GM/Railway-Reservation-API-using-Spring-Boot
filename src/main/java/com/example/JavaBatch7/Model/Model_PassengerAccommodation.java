package com.example.JavaBatch7.Model;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Entity
public class Model_PassengerAccommodation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long sno;

    private long id;

    private String food;

    private BigDecimal foodPrice;

    private boolean fine;

    private BigDecimal finePrice;

    public long getSno() {
        return sno;
    }

    public void setSno(long sno) {
        this.sno = sno;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public BigDecimal getFoodPrice() {
        return foodPrice;
    }

    public void setFoodPrice(BigDecimal foodPrice) {
        this.foodPrice = foodPrice;
    }

    public boolean isFine() {
        return fine;
    }

    public void setFine(boolean fine) {
        this.fine = fine;
    }

    public BigDecimal getFinePrice() {
        return finePrice;
    }

    public void setFinePrice(BigDecimal finePrice) {
        this.finePrice = finePrice;
    }
}
