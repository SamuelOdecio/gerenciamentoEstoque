/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.gerencimentoVenda.Armazenamento;
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
@RequestMapping("/api/local")
public class ArmazenamentoController extends AbstractBasicController<Armazenamento, ArmazenamentoDto, ArmazenamentoForm, ArmazenamentoRepository, ArmazenamentoService, Long> {

    @Autowired
    @Override
    public void setService(ArmazenamentoService service) {
        this.service = service;
        setMapper(ArmazenamentoMapper.INSTANCE);
    }

    @Override
    public URI createUri(Armazenamento entity, UriComponentsBuilder uriBuilder) {
        return uriBuilder.path("/local/{id}")
                .buildAndExpand(entity.getId())
                .toUri();
    }
    
}
