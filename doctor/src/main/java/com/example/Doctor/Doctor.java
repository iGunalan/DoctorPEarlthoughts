package com.example.Doctor;

import jakarta.persistence.*;

@Entity
@Table
public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String schedule;
    private int maxPAtients;


    public Doctor()
    {

    }



    public Doctor(int id, String name, String schedule, int maxPAtients) {
        this.id = id;
        this.name = name;
        this.schedule = schedule;
        this.maxPAtients = maxPAtients;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", schedule='" + schedule + '\'' +
                ", maxPAtients=" + maxPAtients +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public int getMaxPAtients() {
        return maxPAtients;
    }

    public void setMaxPAtients(int maxPAtients) {
        this.maxPAtients = maxPAtients;
    }
}
