/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.gerencimentoEstoque.Cliente;
import br.com.gerencimentoEstoque.arch.service.AbstractBasicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author nicho
 */
@Service
public class ClienteService extends AbstractBasicService<Cliente, Long, ClienteForm, ClienteRepository> {

    @Autowired
    @Override
    public void setRepository(ClienteRepository repository) {
        super.repository = repository;
        setMapper(ClienteMapper.INSTANCE);
    }
}
