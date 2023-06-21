/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.gerencimentoEstoque.ItemVenda;

import br.com.gerencimentoEstoque.Venda.Venda;
import br.com.gerencimentoEstoque.arch.BaseObject;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.SequenceGenerator;
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

    private Venda idVenda;
    @Column(columnDefinition = "Double not null")
    private Double precoVenda;
    @Enumerated(EnumType.STRING)
    private FormaDePagamento formaDePagamento;

}
