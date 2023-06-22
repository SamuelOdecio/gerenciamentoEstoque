/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.gerencimentoVenda.Armazenamento;

import br.com.gerencimentoVenda.Local.Local;
import br.com.gerencimentoVenda.Produto.Produto;
import br.com.gerencimentoVenda.arch.BaseObject;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
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
@EqualsAndHashCode(callSuper = true)
@Entity
@SequenceGenerator(sequenceName = "Armazenamento_sequence", name = "baseObjectSequence", allocationSize = 1)
public class Armazenamento extends BaseObject {

    @Column(columnDefinition = "varchar(255) not null")
    private String data;
    @ManyToOne()
    private List<Local> idLocal;
    @ManyToOne()
    private List<Produto> idProduto;
    @Column(columnDefinition = "Integer not null")
    private int qtdeProduto;

}
