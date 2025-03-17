package com.cursos.api.authorization_server.persistence.repository;

import com.cursos.api.authorization_server.persistence.entity.ClientApp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface ClientAppRepository extends JpaRepository<ClientApp, Long> {

    Optional<ClientApp> findByClientId(String clientId);
}
