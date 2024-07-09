package com.example.You.are.not.forgotten.repositories;

import com.example.You.are.not.forgotten.entities.Donation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DonationRepository extends JpaRepository<Donation, Long> {
}
