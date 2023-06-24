/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.gerencimentoVenda.ItemVenda;

import br.com.gerencimentoVenda.Produto.ProdutoMapper;
import br.com.gerencimentoVenda.Venda.VendaMapper;
import br.com.gerencimentoVenda.arch.BaseObjectMapper;
import br.com.gerencimentoVenda.arch.ISimpleMapper;
import java.util.List;
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
        uses = {ProdutoMapper.class,VendaMapper.class}
)
public interface ItemVendaMapper extends ISimpleMapper<ItemVenda, ItemVendaDto, ItemVendaForm> {

    public static final ItemVendaMapper INSTANCE = Mappers.getMapper(ItemVendaMapper.class);

    @Mapping(target = "id", expression = """
                                         java(
                                            ItemVendaId.builder()
                                                    .vendaId(dto.getVenda().getId())
                                                    .produtoId(dto.getProduto().getId())                                                    
                                                    .build()
                                         )
                                         """)

    @Mapping(target = "venda.itens", ignore = true)
    @Override
    public ItemVenda formToEntity(ItemVendaForm dto);

    @Override
    public ItemVenda dtoToEntity(ItemVendaDto dto);

    @Override
    public ItemVendaDto toDto(ItemVenda entity);

    @Mapping(target = "id", ignore = true)
    @Override

    public ItemVenda update(ItemVendaForm dto, @MappingTarget ItemVenda entity);

    @Override
    public List<ItemVenda> toEntityList(List<ItemVendaDto> items);

    @Override
    public List<ItemVendaDto> toDtoList(List<ItemVenda> items);

    @Override
    public default Page<ItemVendaDto> toDtoPage(Page<ItemVenda> items) {
        return items.map(entity -> toDto(entity));
    }
}
