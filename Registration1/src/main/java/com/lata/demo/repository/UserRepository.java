package com.lata.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lata.demo.entities.Users;

@Repository("ur")
public interface UserRepository extends JpaRepository<Users, Integer>{
}
