/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.gerencimentoEstoque.Venda;

import br.com.gerencimentoEstoque.Produto.Produto;
import br.com.gerencimentoEstoque.arch.dto.AdapterBaseObjectDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 *
 * @author nicho
 */
@Getter
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class VendaDto extends AdapterBaseObjectDto {

    private Data data;
    private Produto id_produto[];
    private Double valorFinal;
    private int qtdeProdutoVendido;

}
