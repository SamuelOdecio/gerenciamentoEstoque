/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.gerencimentoVenda.Cliente;

import br.com.gerencimentoVenda.Venda.Venda;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 *
 * @author Suldine
 */
@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Entity
public class Cliente  {
    @Column(columnDefinition = "varchar(255) not null", name = "nome")
    private String nome;
    @OneToMany(mappedBy = "cliente")
    private List<Venda> vendas;
    @Column(columnDefinition = "varchar(255) not null", name = "CPF")
    @Id
    private String cpf;
    @Column(columnDefinition = "varchar(255) not null")
    private String telefone;
    @Column(columnDefinition = "varchar(255) not null")
    private String endereco;

}
