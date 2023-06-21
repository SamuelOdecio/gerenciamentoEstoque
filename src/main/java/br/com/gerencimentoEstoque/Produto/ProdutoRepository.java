/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.gerencimentoEstoque.Produto;

import br.com.gerencimentoEstoque.arch.repository.IArchRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Suldine
 */
@Repository
public interface ProdutoRepository extends IArchRepository<Produto,Long > {
    
}
