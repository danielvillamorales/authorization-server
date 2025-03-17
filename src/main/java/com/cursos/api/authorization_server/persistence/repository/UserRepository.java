package com.cursos.api.authorization_server.persistence.repository;


import com.cursos.api.authorization_server.persistence.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByUsername(String username);
}
