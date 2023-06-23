/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.gerencimentoVenda.ItemVenda;

import br.com.gerencimentoVenda.Produto.Produto;
import br.com.gerencimentoVenda.Venda.Venda;
import br.com.gerencimentoVenda.arch.BaseObject;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
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
 * @author
 */
@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@SequenceGenerator(sequenceName = "ItemVenda_sequence", name = "baseObjectSequence", allocationSize = 1)
public class ItemVenda extends BaseObject {

    @ManyToOne(cascade = CascadeType.ALL)
    private Venda venda; 
    @ManyToOne()
    private List<Produto> produtos;
    @Enumerated(EnumType.STRING)
    private FormaDePagamento formaDePagamento;

}
