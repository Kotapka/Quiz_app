package com.example.Quiz_app.users;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;

/**
 * Class storing information about user.
 */

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table
public class Users{
    @Id
    @SequenceGenerator(
            name = "users_id_sequence",
            sequenceName = "users_id_sequence"
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "users_id_sequence"
    )

    /**
     * Variables:
     *  - id - stores unique identification number of a user,
     *  - login - user's login,
     *  - email - user's email,
     *  - password - user's password.
     */

    private Integer id;
    private String login;
    private String email;
    private String password;

    /**
     * Method checks if two User class objects are the same.
     * @param o - object being checked.
     * @return true if object are the same and false if they are not.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        com.example.Quiz_app.users.Users users = (com.example.Quiz_app.users.Users) o;
        return Objects.equals(id, users.id) && Objects.equals(login, users.login) && Objects.equals(email, users.email) && Objects.equals(password, users.password);
    }

    /**
     * Function hashes input data
     * @return set of hashed values.
     */
    @Override
    public int hashCode() {
        return Objects.hash(id, login, email, password);
    }

    /**
     * Method returns class variables as a string.
     * @return string containing class variables.
     */
    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
