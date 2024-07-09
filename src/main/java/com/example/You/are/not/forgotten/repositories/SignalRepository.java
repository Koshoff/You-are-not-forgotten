package com.example.You.are.not.forgotten.repositories;

import com.example.You.are.not.forgotten.entities.Signal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SignalRepository extends JpaRepository<Signal, Long> {
}
