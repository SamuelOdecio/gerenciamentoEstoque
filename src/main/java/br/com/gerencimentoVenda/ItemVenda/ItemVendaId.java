/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.gerencimentoVenda.ItemVenda;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 *
 * @author suldine
 */
@Data
@Builder
@EqualsAndHashCode
@Embeddable
public class ItemVendaId {
    
    private ItemVendaId id;
    @Column(name = "venda_id")
    private Long vendaId;

    @Column(name = "produto_id")
    private Long produtoId;

}
