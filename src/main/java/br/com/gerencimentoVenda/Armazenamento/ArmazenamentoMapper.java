/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.gerencimentoVenda.Armazenamento;

import br.com.gerencimentoVenda.Local.LocalMapper;
import br.com.gerencimentoVenda.Produto.ProdutoMapper;
import br.com.gerencimentoVenda.arch.BaseObjectMapper;
import br.com.gerencimentoVenda.arch.ISimpleMapper;
import java.util.List;
import org.mapstruct.InheritConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;
import org.springframework.data.domain.Page;

/**
 *
 * @author nicho
 */
@Mapper(
        config = BaseObjectMapper.class,
        uses = {ProdutoMapper.class, LocalMapper.class}
)
public interface ArmazenamentoMapper extends ISimpleMapper<Armazenamento, ArmazenamentoDto, ArmazenamentoForm> {

    public static final ArmazenamentoMapper INSTANCE = Mappers.getMapper(ArmazenamentoMapper.class);

    @InheritConfiguration(name = "toEntity")
    @Override
    @Mapping(target = "produto.idArmazenamento", ignore = true)
    @Mapping(target = "local.idArmazenamento", ignore = true)

    public Armazenamento formToEntity(ArmazenamentoForm dto);

    @Override
    public Armazenamento dtoToEntity(ArmazenamentoDto dto);

    @Mapping(target = "local.idArmazenamento", ignore = true)
    @Mapping(target = "produto.idArmazenamento", ignore = true)
    @Override
    public ArmazenamentoDto toDto(Armazenamento entity);

    @InheritConfiguration(name = "update")
    @Override
    public Armazenamento update(ArmazenamentoForm dto, @MappingTarget Armazenamento entity);

    @Override
    public List<Armazenamento> toEntityList(List<ArmazenamentoDto> items);

    @Override
    public List<ArmazenamentoDto> toDtoList(List<Armazenamento> items);

    @Override
    public default Page<ArmazenamentoDto> toDtoPage(Page<Armazenamento> items) {
        return items.map(entity -> toDto(entity));
    }
}
