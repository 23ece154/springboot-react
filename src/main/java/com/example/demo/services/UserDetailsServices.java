package com.example.demo.services;

import com.example.demo.models.AuthDetails;
import com.example.demo.models.LoginDetails;
import com.example.demo.repository.RegisterDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.Optional;

@Service
public class UserDetailsServices {
    @Autowired
    RegisterDetailsRepository registerDetailsRepository;

    public String add(AuthDetails register) {
        AuthDetails registerdetails = new AuthDetails();
        registerdetails.setEmpId(register.getEmpId());
        registerdetails.setName(register.getName());
        registerdetails.setPassword(register.getPassword());
        registerdetails.setDob(register.getDob());
        registerdetails.setGender(register.getGender());
        registerdetails.setEmail(register.getEmail());
        registerDetailsRepository.save(register);
        return "Employee added successfully";
    }

//    public String authenticate(AuthDetails login) {
//        AuthDetails user = registerDetailsRepository.findByEmail(login.getEmail());
//        if (user != null) {
//            if (Objects.equals(user.getPassword(), login.getPassword())) {
//                return "Login Successful";
//            }
//        }
//        return "Login not successfull";
//    }

    public boolean authenticate(String userName, String rawPassword) {
        Optional<LoginDetails> userOptional = registerDetailsRepository.findByUserName(userName);
        if (userOptional.isEmpty()) {
            return false;
        }

        LoginDetails user = userOptional.get();
        return passwordEncoder.matches(rawPassword, user.getPassword());
    }

}



