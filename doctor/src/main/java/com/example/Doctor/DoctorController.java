package com.example.Doctor;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("doctor")

public class DoctorController {

    @Autowired
    private DoctorService doctorService;
    public DoctorController(DoctorService doctorService)
    {
        this.doctorService=doctorService;
    }

    @GetMapping
    public List<Doctor> getAll()
    {
        return  doctorService.getAll();
    }

    @GetMapping("get/{id}")
    public Doctor getById(@PathVariable int id)
    {
        return doctorService.getByID(id);
    }

    @PostMapping
    public  Doctor createDoct(@RequestBody Doctor doctor)
    {
        return doctorService.createDoctor(doctor);
    }


}
