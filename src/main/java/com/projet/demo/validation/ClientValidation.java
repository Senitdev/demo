package com.projet.demo.validation;

import com.projet.demo.model.ClientA;

public class ClientValidation {
    public String controle(){
         ClientA clientA=new ClientA();
          String error="";
        if(clientA.getPrenom()==null || clientA.getPrenom().isEmpty()){
            error="Veuillez renseigner le prenom";
        }
      return error;
    }
    
    
}
