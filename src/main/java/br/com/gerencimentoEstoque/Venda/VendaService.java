/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.gerencimentoEstoque.Venda;
import br.com.gerencimentoEstoque.arch.service.AbstractBasicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author suldine
 */
@Service
public class VendaService extends AbstractBasicService<Venda, Long, VendaForm, VendaRepository> {

    @Autowired
    @Override
    public void setRepository(VendaRepository repository) {
        super.repository = repository;
        setMapper(VendaMapper.INSTANCE);
    }
}
