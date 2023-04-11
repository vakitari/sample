package com.vojtechruzicka.javafxweaverexample.repo;

import com.vojtechruzicka.javafxweaverexample.entyti.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<UserEntity,Integer> {
    UserEntity findByLoginAndPass(String login, String pass);


}
