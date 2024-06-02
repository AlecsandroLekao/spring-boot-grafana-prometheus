package com.api_project_rabbit.api_project_rabbit;

import com.api_project_rabbit.api_project_rabbit.models.Dados;

public class Utils {

    private static final String NOME_USER = "nome-user";
    private static final String EMAIL_USER = "email-user";
    private static final String TELEFONE_USER = "telefone-user";

    public static Dados retornaDadosFake(){
        return new Dados(NOME_USER, EMAIL_USER, TELEFONE_USER);
    }
}
