package eu.kielczewski.example.service;

import eu.kielczewski.example.domain.User;

import java.util.Collection;

public interface UserService {

    User save(User user);

    Collection<User> getList();

}
