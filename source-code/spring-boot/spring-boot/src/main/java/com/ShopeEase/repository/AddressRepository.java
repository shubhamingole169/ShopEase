package com.ShopeEase.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ShopeEase.modal.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

}
