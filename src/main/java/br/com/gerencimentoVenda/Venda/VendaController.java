/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.gerencimentoVenda.Venda;
import br.com.gerencimentoVenda.arch.controller.AbstractBasicController;
import java.net.URI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

/**
 *
 * @author nicho
 */
@RestController
@RequestMapping("/api/venda")
public class VendaController extends AbstractBasicController<Venda, VendaDto, VendaForm, VendaRepository, VendaService, Long> {

    @Autowired
    @Override
    public void setService(VendaService service) {
        this.service = service;
        setMapper(VendaMapper.INSTANCE);
    }

    @Override
    public URI createUri(Venda entity, UriComponentsBuilder uriBuilder) {
        return uriBuilder.path("/venda/{id}")
                .buildAndExpand(entity.getId())
                .toUri();
    }
    
}
