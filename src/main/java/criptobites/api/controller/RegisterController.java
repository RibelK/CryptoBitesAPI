package criptobites.api.controller;

import static org.springframework.http.HttpStatus.CREATED;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import criptobites.api.dto.RegisterUserRequestBody;
import criptobites.api.dto.UserInformation;
import criptobites.api.service.RegisterService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@Controller
@RequestMapping("/register")
@RequiredArgsConstructor
public class RegisterController {

    private final RegisterService registerService;

    @PostMapping({ "", "/" })
    @ResponseStatus(CREATED)
    @ResponseBody
    private UserInformation register(@Valid @RequestBody RegisterUserRequestBody body) {
        return registerService.registerNewUser(body);
    }

}
