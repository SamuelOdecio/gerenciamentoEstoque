/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.gerencimentoVenda.Local;

import br.com.gerencimentoVenda.Armazenamento.Armazenamento;
import br.com.gerencimentoVenda.Produto.Produto;
import br.com.gerencimentoVenda.arch.BaseObject;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
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
@SequenceGenerator(sequenceName = "Local_sequence", name = "baseObjectSequence", allocationSize = 1)
public class Local extends BaseObject {

    @ManyToMany()
    @Column(columnDefinition = "varchar(255) not null")
    private String descricao;
    @ManyToMany()
    private Armazenamento idArmazenamento;

}
