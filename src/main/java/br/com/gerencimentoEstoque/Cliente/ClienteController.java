/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.gerencimentoEstoque.Cliente;
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
@RequestMapping("/api/local")
public class ClienteController extends AbstractBasicController<Cliente, ClienteDto, ClienteForm, ClienteRepository, ClienteService, Long> {

    @Autowired
    @Override
    public void setService(ClienteService service) {
        this.service = service;
        setMapper(ClienteMapper.INSTANCE);
    }

    @Override
    public URI createUri(Cliente entity, UriComponentsBuilder uriBuilder) {
        return uriBuilder.path("/local/{id}")
                .buildAndExpand(entity.getId())
                .toUri();
    }
    
}
