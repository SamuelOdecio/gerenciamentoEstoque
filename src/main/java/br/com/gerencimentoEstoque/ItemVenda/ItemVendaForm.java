/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.gerencimentoEstoque.ItemVenda;

import br.com.gerencimentoEstoque.Venda.Venda;
import br.com.gerencimentoEstoque.arch.dto.AdapterBaseObjectForm;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 *
 * @author nicho
 */
@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class ItemVendaForm extends AdapterBaseObjectForm {

    private Venda idVenda;//relacionamento acontecerá aqui
    private Double precoVenda;
    private FormaDePagamento formaDePagamento;

}
