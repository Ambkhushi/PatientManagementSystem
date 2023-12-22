package com.Project.springrest.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Project.springrest.Entites.Prescriptions;

public interface PrescriptionsRepo extends JpaRepository<Prescriptions, Long> {

}
