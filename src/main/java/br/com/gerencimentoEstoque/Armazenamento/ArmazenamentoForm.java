/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.gerencimentoEstoque.Armazenamento;


import br.com.gerencimentoEstoque.Local.Local;
import br.com.gerencimentoEstoque.Produto.Produto;
import br.com.gerencimentoEstoque.arch.dto.AdapterBaseObjectForm;
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
public class ArmazenamentoForm extends AdapterBaseObjectForm {
    
    private String data;
    private List <Local> idLocal;
    private List <Produto> idProduto;
    private int qtdeProduto;
    
}
