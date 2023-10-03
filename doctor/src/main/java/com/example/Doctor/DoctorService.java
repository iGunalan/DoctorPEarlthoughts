package com.example.Doctor;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class DoctorService {

    @Autowired
    private DoctorRepositor doctorRepositor;
    public DoctorService(DoctorRepositor doctorRepositor)
    {
        this.doctorRepositor=doctorRepositor;
    }

    public List<Doctor> getAll()
    {
        return doctorRepositor.findAll();
    }
    public Doctor getByID(int id)
    {
        return doctorRepositor.findById(id).orElse(null);

    }

    public Doctor createDoctor(Doctor doctor)
    {
        return doctorRepositor.save(doctor);
    }



}
