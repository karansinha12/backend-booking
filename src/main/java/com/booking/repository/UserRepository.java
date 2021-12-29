package com.booking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.booking.model.UsersModel;

@Repository
public interface UserRepository extends JpaRepository<UsersModel, Long>{

}
