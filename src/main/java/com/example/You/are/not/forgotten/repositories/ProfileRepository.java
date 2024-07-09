package com.example.You.are.not.forgotten.repositories;

import com.example.You.are.not.forgotten.entities.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfileRepository extends JpaRepository<Profile, Long> {
}
