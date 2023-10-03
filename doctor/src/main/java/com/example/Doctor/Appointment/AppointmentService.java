package com.example.Doctor.Appointment;


import com.example.Doctor.Doctor;
import com.example.Doctor.DoctorRepositor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service

public class AppointmentService {

    @Autowired
    private AppointmentRepository appointmentRepository;
    private  DoctorRepositor doctorRepositor;

    public AppointmentService(AppointmentRepository appointmentRepository, DoctorRepositor doctorRepositor) {
        this.appointmentRepository = appointmentRepository;
        this.doctorRepositor = doctorRepositor;
    }

    public List<Appointment> booked()
    {
        return appointmentRepository.findAll();
    }


    public String bookAppointment(Appointment appointmentRequest, int id) {
        int doctorId = appointmentRequest.getDoctorId();
        LocalDate appointmentDate = appointmentRequest.getDate();

        Optional<Doctor> doctor = doctorRepositor.findById(doctorId);
        if (doctor.isEmpty()) {
            return "Doctor not present";
        }

        Appointment appointment = new Appointment();
        appointment.setDoctorId(doctorId);
        appointment.setDate(appointmentDate);
        appointmentRepository.save(appointment);

        return "Appointment booked successfully";
    }
}
