/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.gerencimentoEstoque.Armazenamento;

import br.com.gerencimentoEstoque.Local.Local;
import br.com.gerencimentoEstoque.Produto.Produto;
import br.com.gerencimentoEstoque.arch.BaseObject;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
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
    private List <Local> idLocal;
    private List <Produto> idProduto;
    private int qtdeProduto;
    

}
