package com.one2many.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.one2many.demo.entities.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

}
