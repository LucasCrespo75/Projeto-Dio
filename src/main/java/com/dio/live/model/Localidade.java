package com.dio.live.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.*;



@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity

//SENDO UMA LOCALIDADE 1 NIVEL DE ACESSO
public class Localidade {
    @Id
    private Long id;
    @ManyToOne
    private NivelAcesso nivelAcessoAcesso;
    private String descricao;


}
