/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.gerencimentoEstoque.Venda;


import br.com.gerencimentoEstoque.arch.BaseObjectMapper;
import br.com.gerencimentoEstoque.arch.ISimpleMapper;
import java.util.List;
import org.mapstruct.InheritConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;
import org.springframework.data.domain.Page;

/**
 *
 * @author suldine
 */
@Mapper(
        config = BaseObjectMapper.class,
        uses = {VendaMapper.class}
        )
public interface VendaMapper extends ISimpleMapper<Venda, VendaDto, VendaForm> {
    
    public static final VendaMapper INSTANCE = Mappers.getMapper(VendaMapper.class);
    
    @InheritConfiguration(name = "toEntity")
    @Override
    public Venda formToEntity(VendaForm dto);

    @Override
    public Venda dtoToEntity(VendaDto dto);

    @Override
    public  VendaDto toDto(Venda entity);

    @InheritConfiguration(name = "update")
    @Override
    public Venda update(VendaForm dto, @MappingTarget Venda entity);

    @Override
    public List<Venda> toEntityList(List<VendaDto> items);

    @Override
    public List<VendaDto> toDtoList(List<Venda> items);

    @Override
    public default Page<VendaDto> toDtoPage(Page<Venda> items) {
        return items.map(entity -> toDto(entity));
    }
}
