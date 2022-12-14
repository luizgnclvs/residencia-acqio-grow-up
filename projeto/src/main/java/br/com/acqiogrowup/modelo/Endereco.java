package br.com.acqiogrowup.modelo;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
public class Endereco implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long enderecoId;
    private String cep;
    private String logradouro;
    private Integer numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String estado;

    /* @OneToOne(mappedBy = "endereco")
    private Cliente cliente; */
}

// muitos clientes para 1 endereço