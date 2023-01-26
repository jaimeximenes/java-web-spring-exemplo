package com.exemplospringboot.userdept.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exemplospringboot.userdept.entities.Departament;

public interface Dptrepository extends JpaRepository<Departament, Long> {

}
