package com.campusdual.appmazing.model.dto.dtomapper;


import com.campusdual.appmazing.model.Product;
import com.campusdual.appmazing.model.dto.ProductDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface ProductMapper {

    // va a utilizar el solo un elemento instance
    ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);

    // pasado un producto lo convierte en un productoDTO
    ProductDTO toDTO(Product product);
// pasarle una lista de productos y nos devuelve una lista de dto
    List<ProductDTO> toDTOList(List<Product> products);
// pasar producto dto a producto
    Product toEntity(ProductDTO productDTO);
}
