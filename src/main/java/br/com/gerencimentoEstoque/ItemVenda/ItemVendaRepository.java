/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.gerencimentoEstoque.ItemVenda;

import br.com.gerencimentoEstoque.arch.repository.IArchRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author nicho
 */
@Repository
public interface ItemVendaRepository extends IArchRepository<ItemVenda,Long > {
    
}
