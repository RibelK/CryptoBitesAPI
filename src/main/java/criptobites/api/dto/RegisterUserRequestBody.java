package criptobites.api.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.validation.constraints.NotBlank;

public record RegisterUserRequestBody(
    @NotBlank
    @JsonProperty("full_name")
    String fullName,

    @NotBlank
    @JsonProperty("phone_number")
    String phoneNumber,

    @NotBlank
    String email,

    @NotBlank
    String password
) {

}
