/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.gerencimentoVenda.ItemVenda;
import br.com.gerencimentoVenda.arch.service.AbstractBasicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author nicho
 */
@Service
public class ItemVendaService extends AbstractBasicService<ItemVenda, Long, ItemVendaForm, ItemVendaRepository> {

    @Autowired
    @Override
    public void setRepository(ItemVendaRepository repository) {
        super.repository = repository;
        setMapper(ItemVendaMapper.INSTANCE);
    }
}
