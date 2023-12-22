package com.Project.springrest.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Project.springrest.Entites.Contact;

public interface ContactRepo  extends JpaRepository<Contact, Long> {

}
