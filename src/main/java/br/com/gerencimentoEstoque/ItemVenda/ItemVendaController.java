/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.gerencimentoEstoque.ItemVenda;
import br.com.gerencimentoEstoque.arch.controller.AbstractBasicController;
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
@RequestMapping("/api/itemVenda")
public class ItemVendaController extends AbstractBasicController<ItemVenda, ItemVendaDto, ItemVendaForm, ItemVendaRepository, ItemVendaService, Long> {

    @Autowired
    @Override
    public void setService(ItemVendaService service) {
        this.service = service;
        setMapper(ItemVendaMapper.INSTANCE);
    }

    @Override
    public URI createUri(ItemVenda entity, UriComponentsBuilder uriBuilder) {
        return uriBuilder.path("/itemVenda/{id}")
                .buildAndExpand(entity.getId())
                .toUri();
    }
    
}
