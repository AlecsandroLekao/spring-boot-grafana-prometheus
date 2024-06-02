package com.api_project_rabbit.api_project_rabbit.services;


import com.api_project_rabbit.api_project_rabbit.models.Dados;
import com.api_project_rabbit.api_project_rabbit.models.Usuario;
import com.api_project_rabbit.api_project_rabbit.repositories.UsuarioRepository;
import com.api_project_rabbit.api_project_rabbit.sender.EmailSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class EmailService {

    private static final String MENSAGEM_RECEBIDA = "Mensagem recebida.";

    @Autowired
    private UsuarioRepository repository;

    @Autowired
    private EmailSender sender;

    public Dados sendEmail(Dados dados){
        repository.save(new Usuario(dados));
        sender.send(dados);
        return dados;
    }
}
