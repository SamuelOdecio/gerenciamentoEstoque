/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.gerencimentoVenda.Produto;


import br.com.gerencimentoVenda.arch.BaseObjectMapper;
import br.com.gerencimentoVenda.arch.ISimpleMapper;
import java.util.List;
import org.mapstruct.InheritConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;
import org.springframework.data.domain.Page;

/**
 *
 * @author Suldine
 */
@Mapper(
        config = BaseObjectMapper.class,
        uses = {ProdutoMapper.class}
        )
public interface ProdutoMapper extends ISimpleMapper<Produto, ProdutoDto, ProdutoForm> {
    
    public static final ProdutoMapper INSTANCE = Mappers.getMapper(ProdutoMapper.class);
    
    @InheritConfiguration(name = "toEntity")
    @Override
    public Produto formToEntity(ProdutoForm dto);

    @Override
    public Produto dtoToEntity(ProdutoDto dto);

    @Override
    public  ProdutoDto toDto(Produto entity);

    @InheritConfiguration(name = "update")
    @Override
    public Produto update(ProdutoForm dto, @MappingTarget Produto entity);

    @Override
    public List<Produto> toEntityList(List<ProdutoDto> items);

    @Override
    public List<ProdutoDto> toDtoList(List<Produto> items);

    @Override
    public default Page<ProdutoDto> toDtoPage(Page<Produto> items) {
        return items.map(entity -> toDto(entity));
    }
}
