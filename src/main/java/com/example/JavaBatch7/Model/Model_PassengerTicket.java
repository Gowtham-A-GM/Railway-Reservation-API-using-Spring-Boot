package com.example.JavaBatch7.Model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
public class Model_PassengerTicket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long sno;

    private long id;

    private String type;

    private LocalDateTime time;

    private long tno;   // travel number

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public long getTno() {
        return tno;
    }

    public void setTno(long tno) {
        this.tno = tno;
    }
}

