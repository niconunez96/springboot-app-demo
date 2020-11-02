package com.taller.tpdeploy.repositories;

import com.taller.tpdeploy.model.Alumno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlumnoRepository extends JpaRepository<Alumno,Long>{
}
