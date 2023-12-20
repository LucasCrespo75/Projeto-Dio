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

public class TipoData {
    @Id
    private Long id;
    private String descricao;


}
