package br.com.geisonbrunodev.teststudyjunit.services.impl;

import br.com.geisonbrunodev.teststudyjunit.domain.User;
import br.com.geisonbrunodev.teststudyjunit.repositories.UserRepository;
import br.com.geisonbrunodev.teststudyjunit.services.UserService;
import br.com.geisonbrunodev.teststudyjunit.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repository;

    @Override
    public User findById(Integer id) {
        Optional<User> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Object not found!"));
    }
}
