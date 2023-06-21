/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.gerencimentoEstoque.Venda;

import br.com.gerencimentoEstoque.Produto.Produto;
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
@SequenceGenerator(sequenceName = "Venda_sequence", name = "baseObjectSequence", allocationSize = 1)
public class Venda extends BaseObject {

    private Data data;
    private Produto id_produto[]; //relacionanto acontecerá aqui
    @Column(columnDefinition = "Double not null")
    private Double valorFinal;
    @Column(columnDefinition = "Integer not null")
    private int qtdeProdutoVendido;

}
