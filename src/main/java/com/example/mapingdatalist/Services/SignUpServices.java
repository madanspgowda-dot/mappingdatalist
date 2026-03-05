package com.example.mapingdatalist.Services;

import com.example.mapingdatalist.Entity.SignupEntity;
import com.example.mapingdatalist.Repository.SignUpRepository;
import org.springframework.stereotype.Service;

@Service
public class SignUpServices {
    private final SignUpRepository signUpRepository;

    public SignUpServices(SignUpRepository signUpRepository) {
        this.signUpRepository = signUpRepository;
    }
    public SignupEntity savesignpdata(SignupEntity signup) {
        return signUpRepository.save(signup);
    }
    public boolean existsByEmail(String email) {
        return signUpRepository.findByEmail(email).isPresent();
    }


}
