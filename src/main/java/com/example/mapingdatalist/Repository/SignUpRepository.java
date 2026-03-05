package com.example.mapingdatalist.Repository;

import com.example.mapingdatalist.Entity.SignupEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SignUpRepository extends JpaRepository<SignupEntity, Integer> {

    Optional<SignupEntity> findByEmail(String email);
}
