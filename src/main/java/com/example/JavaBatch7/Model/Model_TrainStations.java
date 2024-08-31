package com.example.JavaBatch7.Model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Model_TrainStations {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long tno;

    private int stationId;
    private String stationName;

    public long getTno() {
        return tno;
    }

    public void setTno(long tno) {
        this.tno = tno;
    }

    public int getStationId() {
        return stationId;
    }

    public void setStationId(int stationId) {
        this.stationId = stationId;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }
}



