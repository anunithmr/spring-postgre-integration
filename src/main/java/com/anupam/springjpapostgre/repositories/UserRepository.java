package com.anupam.springjpapostgre.repositories;

import com.anupam.springjpapostgre.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
}
