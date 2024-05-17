/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.ac.cr.api.services;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ucr.ac.cr.api.models.LoginModel;
import ucr.ac.cr.api.repositories.LoginRepository;

/**
 *
 * @author Marco
 */
@Service
public class LoginService {
    @Autowired
    LoginRepository loginRepository;
    
     public ArrayList<LoginModel> obtenerUsuarios() {
        return (ArrayList<LoginModel>) loginRepository.findAll();
    }

    public LoginModel guardarUsuario(LoginModel usuario) {
        return loginRepository.save(usuario);
    }
}
