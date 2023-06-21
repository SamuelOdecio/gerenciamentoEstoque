/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.gerencimentoEstoque.Produto;

import br.com.gerencimentoEstoque.arch.BaseObject;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.SequenceGenerator;
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
@EqualsAndHashCode(callSuper = true)
@Entity
@SequenceGenerator(sequenceName = "Produto_sequence", name = "baseObjectSequence", allocationSize = 1)
public class Produto extends BaseObject {
  
    @Column(columnDefinition = "Double not null")
    private Double preco;
    @Column(columnDefinition = "int not null")
    private static int qtdeEstoque; //relacionamento acontece aqui
    @Column(columnDefinition = "varchar(255) not null")
    private String marca;
    @Column(columnDefinition = "varchar(255) not null")
    private String descricao;
    @Column(columnDefinition = "Long not null")
    private Long idLocal;

}
