package com.dio.live.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class Empresa {

    @Id
    private Long id;
    private String descricao;

    //Ideal uso de mascara
    private String cnpj;

    //POdendo ser uma entidade separada apenas para endereco
    private String endereco;
    private String bairo;
    private String cidade;
    private String estado;
    private String telefone;






}
