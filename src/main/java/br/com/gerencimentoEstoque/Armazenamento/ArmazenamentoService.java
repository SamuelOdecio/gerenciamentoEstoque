/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.gerencimentoEstoque.Armazenamento;
import br.com.gerencimentoEstoque.arch.service.AbstractBasicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author nicho
 */
@Service
public class ArmazenamentoService extends AbstractBasicService<Armazenamento, Long, ArmazenamentoForm, ArmazenamentoRepository> {

    @Autowired
    @Override
    public void setRepository(ArmazenamentoRepository repository) {
        super.repository = repository;
        setMapper(ArmazenamentoMapper.INSTANCE);
    }
}
