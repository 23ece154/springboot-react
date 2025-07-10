package com.example.demo.repository;

import com.example.demo.models.AuthDetails;
import com.example.demo.models.LoginDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RegisterDetailsRepository extends JpaRepository<AuthDetails,Integer> {
    AuthDetails findByEmail(String email);

    Optional<LoginDetails> findByUserName(String userName);
}
