package com.LoginRegistration.Repository;

import com.LoginRegistration.Model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Integer> {
}
