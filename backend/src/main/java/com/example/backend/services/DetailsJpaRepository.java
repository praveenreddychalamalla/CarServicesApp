package com.example.backend.services;

import com.example.backend.DAO.UserDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetailsJpaRepository extends JpaRepository<UserDetails, Long> {
    UserDetails findUserDetailsByEmailAndPassword(String email, String password);

    UserDetails findByUsername(String username);

    UserDetails findByEmail(String email);
}
