package criptobites.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

import criptobites.api.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findById(final long id);

    Optional<User> findByEmailAndPassword(final String email, final String password);

}
