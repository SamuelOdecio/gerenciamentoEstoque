/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.gerencimentoVenda.Cliente;
import br.com.gerencimentoVenda.arch.controller.AbstractBasicController;
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
@RequestMapping("/api/cliente")
public class ClienteController extends AbstractBasicController<Cliente, ClienteDto, ClienteForm, ClienteRepository, ClienteService, Long> {

    @Autowired
    @Override
    public void setService(ClienteService service) {
        this.service = service;
        setMapper(ClienteMapper.INSTANCE);
    }

    @Override
    public URI createUri(Cliente entity, UriComponentsBuilder uriBuilder) {
        return uriBuilder.path("/cliente/{cpf}")
                .buildAndExpand(entity.getCpf())
                .toUri();
    }
    
}
