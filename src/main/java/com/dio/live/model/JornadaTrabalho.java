package com.dio.live.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder //Passagem de dados para um DTO ou alguma outra
@Entity
public class JornadaTrabalho {

    @Id
    private Long id;
    private String descricao;
}
