/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.gerencimentoVenda.Venda;

import br.com.gerencimentoVenda.Cliente.Cliente;
import br.com.gerencimentoVenda.ItemVenda.ItemVenda;
import br.com.gerencimentoVenda.arch.BaseObject;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 *
 * @author Suldine
 */
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@SequenceGenerator(sequenceName = "Venda_sequence", name = "baseObjectSequence", allocationSize = 1)
public class Venda extends BaseObject {

    @ManyToOne    
private Cliente cliente;
    
    @OneToMany(mappedBy = "id.vendaId",
            fetch = FetchType.LAZY,
            cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST},
            orphanRemoval = true)
      private List<ItemVenda> itens;
    
}
