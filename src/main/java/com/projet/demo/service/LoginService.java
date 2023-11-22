package com.projet.demo.service;
import java.util.Optional;
import org.springframework.stereotype.Service;

import com.projet.demo.model.Login;
import com.projet.demo.repository.LoginRepository;
@Service
public class LoginService {
   private LoginRepository loginRepository;
   public LoginService(LoginRepository loginRepository){
    this.loginRepository=loginRepository;
   }
   public Optional<Login>recherche(String email){
    return loginRepository.findByEmail(email);
   }
}
