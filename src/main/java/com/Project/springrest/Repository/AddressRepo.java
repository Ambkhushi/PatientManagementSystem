package com.Project.springrest.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Project.springrest.Entites.Address;

public interface AddressRepo  extends JpaRepository<Address, Long>{

}
