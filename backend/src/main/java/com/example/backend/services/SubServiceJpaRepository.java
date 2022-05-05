package com.example.backend.services;

import com.example.backend.DAO.SubServiceDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SubServiceJpaRepository extends JpaRepository<SubServiceDetails, Long> {
    List<SubServiceDetails> findByServiceProviderID(Long serviceProviderID);

}
