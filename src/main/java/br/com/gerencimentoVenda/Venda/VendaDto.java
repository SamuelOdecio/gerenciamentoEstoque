/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.gerencimentoVenda.Venda;

import br.com.gerencimentoVenda.Cliente.ClienteDto;
import br.com.gerencimentoVenda.ItemVenda.ItemVendaDto;
import br.com.gerencimentoVenda.arch.dto.AdapterBaseObjectDto;
import java.util.List;
import lombok.AllArgsConstructor;
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

    private ClienteDto cliente;
    private List<ItemVendaDto> itens;
  
    

}
