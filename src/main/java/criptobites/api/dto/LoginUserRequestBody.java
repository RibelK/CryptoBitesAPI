package criptobites.api.dto;

import jakarta.validation.constraints.NotBlank;

public record LoginUserRequestBody(
    @NotBlank
    String email,

    @NotBlank
    String password
) {

}
