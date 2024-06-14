package criptobites.api.service;

import org.springframework.stereotype.Service;

import criptobites.api.dto.LoginUserRequestBody;
import criptobites.api.dto.UserInformation;
import criptobites.api.exception.NonexistentUserException;
import criptobites.api.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.val;

@Service
@RequiredArgsConstructor
public class LoginService {

    private final UserService userService;
    private final UserRepository userRepository;

    public UserInformation loginUser(final LoginUserRequestBody body) {
        val userId = userRepository.findByEmailAndPassword(body.email(), body.password());

        if (!userId.isPresent()) {
            throw new NonexistentUserException();
        }

        return userService.getUserInformation(userId.get().getId());
    }

}
