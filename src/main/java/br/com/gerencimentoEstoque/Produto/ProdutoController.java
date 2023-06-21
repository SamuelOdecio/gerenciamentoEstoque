/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.gerencimentoEstoque.Produto;
import br.com.gerencimentoEstoque.arch.controller.AbstractBasicController;
import java.net.URI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

/**
 *
 * @author Suldine
 */
@RestController
@RequestMapping("/api/produto")
public class ProdutoController extends AbstractBasicController<Produto, ProdutoDto, ProdutoForm, ProdutoRepository, ProdutoService, Long> {

    @Autowired
    @Override
    public void setService(ProdutoService service) {
        this.service = service;
        setMapper(ProdutoMapper.INSTANCE);
    }

    @Override
    public URI createUri(Produto entity, UriComponentsBuilder uriBuilder) {
        return uriBuilder.path("/produto/{id}")
                .buildAndExpand(entity.getId())
                .toUri();
    }
    
}
