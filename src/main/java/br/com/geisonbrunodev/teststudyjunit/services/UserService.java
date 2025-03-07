package br.com.geisonbrunodev.teststudyjunit.services;

import br.com.geisonbrunodev.teststudyjunit.domain.User;

import java.util.List;

public interface UserService {

    User findById(Integer id);

    List<User> findAll();

}
