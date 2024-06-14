package criptobites.api.service;

import org.springframework.stereotype.Service;

import criptobites.api.dto.RegisterUserRequestBody;
import criptobites.api.dto.UserInformation;
import criptobites.api.model.User;
import criptobites.api.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.val;

@Service
@RequiredArgsConstructor
public class RegisterService {

    private final UserService userService;
    private final UserRepository userRepository;

    public UserInformation registerNewUser(final RegisterUserRequestBody body) {
        val user = new User(body);
        val result = userRepository.save(user);

        return userService.getUserInformation(result.getId());
    }

}
