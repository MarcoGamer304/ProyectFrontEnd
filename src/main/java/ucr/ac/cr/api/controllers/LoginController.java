/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.ac.cr.api.controllers;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ucr.ac.cr.api.models.LoginModel;
import ucr.ac.cr.api.services.LoginService;

/**
 *
 * @author Marco
 */
@RestController
@RequestMapping("/login")
public class LoginController {
    @Autowired
    LoginService loginService;
    
     @GetMapping
    public ArrayList<LoginModel> obtenerUsuarios() {
        return loginService.obtenerUsuarios();
    }

    @PostMapping
    public LoginModel guardarUsuario(@RequestBody LoginModel model) {
        return this.loginService.guardarUsuario(model);
    }
}
