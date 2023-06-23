/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.gerencimentoVenda.Cliente;

import br.com.gerencimentoVenda.arch.BaseObject;
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
@SequenceGenerator(sequenceName = "Cliente_sequence", name = "baseObjectSequence", allocationSize = 1)
public class Cliente extends BaseObject {
   
    @Column(columnDefinition = "varchar(255) not null", name = "CPF")
    private String cpf;
    @Column(columnDefinition = "varchar(255) not null")
    private String telefone;
    @Column(columnDefinition = "varchar(255) not null")
    private String endereco;
    

}
