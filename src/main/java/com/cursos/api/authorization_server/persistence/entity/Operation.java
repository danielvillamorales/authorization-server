package com.cursos.api.authorization_server.persistence.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Operation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    private String path;

    private String httpMethod;

    private boolean permitAll;

    @ManyToOne
    @JoinColumn(name = "module_id")
    private Module module;
}
