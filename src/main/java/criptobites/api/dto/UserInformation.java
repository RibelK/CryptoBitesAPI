package criptobites.api.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import criptobites.api.model.User;

public record UserInformation (
    @JsonProperty("full_name")
    String fullName,
    String email
) {

    public static UserInformation fromUserEntity(final User user) {
        return new UserInformation(
            user.getFullName(),
            user.getEmail()
        );
    }

}
