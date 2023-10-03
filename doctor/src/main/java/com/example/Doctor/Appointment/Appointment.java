package com.example.Doctor.Appointment;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table
public class Appointment {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)

    private int id;
    private int doctorId;
    private LocalDate date;

    public Appointment()
    {}

    public Appointment(int id, int doctorId, LocalDate date) {
        this.id = id;
        this.doctorId = doctorId;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }



}
