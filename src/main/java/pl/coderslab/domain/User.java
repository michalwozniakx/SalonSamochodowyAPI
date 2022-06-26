package pl.coderslab.domain;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.util.Objects;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long id;
    @Size(min = 2)
    @NotNull
    private String name;
    @Size(min = 2)
    @NotNull
    private String surname;
    @Email
    @NotNull
    private String email;
    @Digits(integer=9, fraction=0)
    @NotNull
    private int phone;
    @Size(min = 2)
    @NotNull
    private String login;
    @Size(min = 2)
    @NotNull
    private String hashedPassword;

    @OneToOne(mappedBy = "user")
    private Configuration configuration;

    public User() {
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getHashedPassword() {
        return hashedPassword;
    }

    public void setHashedPassword(String hashedPassword) {
        this.hashedPassword = hashedPassword;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        User user = (User) o;
//        return hashedPassword.equals(user.hashedPassword);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(hashedPassword);
//    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", phone=" + phone +
                ", login='" + login + '\'' +
                ", hashedPassword='" + hashedPassword + '\'' +
                '}';
    }
}
