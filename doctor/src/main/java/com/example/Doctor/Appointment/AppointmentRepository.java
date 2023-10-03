package com.example.Doctor.Appointment;

import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;

public interface AppointmentRepository extends JpaRepository<Appointment,Integer> {
    Appointment findByDate(LocalDate date);
}
