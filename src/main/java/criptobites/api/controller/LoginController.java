package criptobites.api.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import criptobites.api.dto.LoginUserRequestBody;
import criptobites.api.dto.UserInformation;
import criptobites.api.service.LoginService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@Controller
@RequestMapping("/login")
@RequiredArgsConstructor
public class LoginController {

    private final LoginService loginService;

    @PostMapping({ "", "/" })
    @ResponseBody
    private UserInformation login(@Valid @RequestBody LoginUserRequestBody body) {
        return loginService.loginUser(body);
    }

}
