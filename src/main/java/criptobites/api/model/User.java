package criptobites.api.model;

import static jakarta.persistence.GenerationType.AUTO;

import criptobites.api.dto.RegisterUserRequestBody;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = AUTO)
    private long id;

    @Column(name = "full_name")
    String fullName;

    @Column(name = "phone_number")
    String phoneNumber;

    @Column(name = "email")
    String email;

    @Column(name = "password")
    String password;

    public User(final RegisterUserRequestBody registerUserRequestBody) {
        this.fullName = registerUserRequestBody.fullName();
        this.phoneNumber = registerUserRequestBody.phoneNumber();
        this.email = registerUserRequestBody.email();
        this.password = registerUserRequestBody.password();
    }

}
