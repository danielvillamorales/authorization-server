package com.cursos.api.authorization_server.service;

import com.cursos.api.authorization_server.exception.NotFoundException;
import com.cursos.api.authorization_server.mapper.ClientAppMapper;
import com.cursos.api.authorization_server.persistence.repository.ClientAppRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.oauth2.server.authorization.client.RegisteredClient;
import org.springframework.security.oauth2.server.authorization.client.RegisteredClientRepository;
import org.springframework.stereotype.Service;

@Slf4j
@AllArgsConstructor
@Service
public class RegisteredClientService implements RegisteredClientRepository {

    private final ClientAppRepository clientAppRepository;

    /**
     * Saves the registered client.
     *
     * <p>
     * IMPORTANT: Sensitive information should be encoded externally from the
     * implementation, e.g. {@link RegisteredClient#getClientSecret()}
     *
     * @param registeredClient the {@link RegisteredClient}
     */
    @Override
    public void save(RegisteredClient registeredClient) {

    }

    /**
     * Returns the registered client identified by the provided {@code id}, or
     * {@code null} if not found.
     *
     * @param id the registration identifier
     * @return the {@link RegisteredClient} if found, otherwise {@code null}
     */
    @Override
    public RegisteredClient findById(String id) {
        return ClientAppMapper.toRegisteredClient(clientAppRepository.findByClientId(id)
                .orElseThrow(() -> new NotFoundException("cliente no encontrado")));
    }

    /**
     * Returns the registered client identified by the provided {@code clientId}, or
     * {@code null} if not found.
     *
     * @param clientId the client identifier
     * @return the {@link RegisteredClient} if found, otherwise {@code null}
     */
    @Override
    public RegisteredClient findByClientId(String clientId) {
        return findById(clientId);
    }


}
