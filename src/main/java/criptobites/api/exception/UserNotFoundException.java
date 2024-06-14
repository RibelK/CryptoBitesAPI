package criptobites.api.exception;

public class UserNotFoundException extends RuntimeException {

    public UserNotFoundException(final long userId) {
        super("There was a problem trying to find the user" + userId);
    }

}
