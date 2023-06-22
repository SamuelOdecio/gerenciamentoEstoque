/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.gerencimentoVenda.Produto;
import br.com.gerencimentoVenda.arch.service.AbstractBasicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Suldine
 */
@Service
public class ProdutoService extends AbstractBasicService<Produto, Long, ProdutoForm, ProdutoRepository> {

    @Autowired
    @Override
    public void setRepository(ProdutoRepository repository) {
        super.repository = repository;
        setMapper(ProdutoMapper.INSTANCE);
    }
}
