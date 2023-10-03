package com.example.Doctor.Appointment;


import com.example.Doctor.DoctorRepositor;
import com.example.Doctor.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("appointment")

public class AppointmentController {


    @Autowired
    private AppointmentService appointmentService;
    private DoctorService doctorService;

    public AppointmentController(AppointmentService appointmentService, DoctorService doctorService) {
        this.appointmentService = appointmentService;
        this.doctorService = doctorService;
    }

    @GetMapping
    public List<Appointment> bookedAppoint()
    {
        return appointmentService.booked();
    }

    @PostMapping("create/{id}")

    public String  appointmentReques(@PathVariable int id, @RequestBody Appointment appointment)
    {
        return  appointmentService.bookAppointment(appointment,id);
    }
}
