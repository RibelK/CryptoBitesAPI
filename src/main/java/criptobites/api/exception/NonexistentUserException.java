package criptobites.api.exception;

public class NonexistentUserException extends RuntimeException {

    public NonexistentUserException() {
        super("The credentials for this user are invalid");
    }

}
