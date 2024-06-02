package com.api_project_rabbit.api_project_rabbit.models;

import jakarta.validation.constraints.NotBlank;

public record Dados(@NotBlank String nome, @NotBlank String email, String telefone) {

}
