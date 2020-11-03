package com.taller.tpdeploy.controllers;

import com.taller.tpdeploy.model.Alumno;
import com.taller.tpdeploy.repositories.AlumnoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/alumnos")
public class AlumnoController {

    @Autowired
    private AlumnoRepository alumnoRepository;

    @GetMapping("/")
    public ResponseEntity<List<Alumno>> getAll() {
        return ResponseEntity.status(HttpStatus.OK).body(alumnoRepository.findAll());
    }

    @GetMapping("/{id}/")
    public ResponseEntity<Alumno> getById(@PathVariable Long id){
        try{
            Alumno alumnoFound = alumnoRepository.findById(id).get();
            return ResponseEntity.ok(alumnoFound);
        }catch(Exception e){
            return ResponseEntity.notFound().build();
        }
    }
    @PostMapping("/")
    public ResponseEntity<?> create(@RequestBody Alumno alumno) {
        Alumno alumnoCreated = alumnoRepository.save(alumno);
        return ResponseEntity
                .created(URI.create(String.format("/api/v1/alumnos/%d/", alumnoCreated.getId())))
                .build();

    }
}