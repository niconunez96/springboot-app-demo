package com.taller.tpdeploy.repositories;

import com.taller.tpdeploy.model.Alumno;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Repository
public class AlumnoRepository {

    public List<Alumno> findAll(){
        return Arrays.asList(new Alumno("Marcos", "Lopez", "mlopez@gmail.com",new Date(2020, 10,2)));
    }
}
