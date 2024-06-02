package com.api_project_rabbit.api_project_rabbit.controllers;

import com.api_project_rabbit.api_project_rabbit.models.Dados;
import com.api_project_rabbit.api_project_rabbit.services.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.api_project_rabbit.api_project_rabbit.Utils.retornaDadosFake;

@RestController
public class UsuarioController {

    @Autowired
    private EmailService emailService;

    @GetMapping(value = "/usuarios")
    public ResponseEntity<Dados> getUsuarios(){
        return ResponseEntity.ok(emailService.sendEmail(retornaDadosFake()));
    }
}
