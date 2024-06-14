package criptobites.api.service;

import org.springframework.stereotype.Service;

import criptobites.api.dto.UserInformation;
import criptobites.api.exception.UserNotFoundException;
import criptobites.api.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.val;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public UserInformation getUserInformation(final long userId) {
        val user = userRepository.findById(userId);

        if (!user.isPresent()) {
            throw new UserNotFoundException(userId);
        }

        return UserInformation.fromUserEntity(user.get());
    }

}
