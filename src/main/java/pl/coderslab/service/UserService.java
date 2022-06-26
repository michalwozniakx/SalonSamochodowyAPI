package pl.coderslab.service;

import pl.coderslab.domain.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    List<User> getUsers();

    void add(User user);

    Optional<User> get(Long id);

    void delete(Long id);

    void edit(User user);

}
