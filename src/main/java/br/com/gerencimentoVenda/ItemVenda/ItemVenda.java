/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.gerencimentoVenda.ItemVenda;

import br.com.gerencimentoVenda.Produto.Produto;
import br.com.gerencimentoVenda.Venda.Venda;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 *
 * @author suldine
 */
@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class ItemVenda implements Serializable {
    
    @EmbeddedId
    private ItemVendaId id;
    
    
    @ManyToOne()
    @JoinColumn(name = "venda_id", insertable = false, updatable = false)
    private Venda venda;
    
    @ManyToOne()
    @JoinColumn(name = "produto_id", insertable = false, updatable = false)
    private Produto produto;
    
  

}
