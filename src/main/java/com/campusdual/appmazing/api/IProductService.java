package com.campusdual.appmazing.api;

import com.campusdual.appmazing.model.dto.ProductDTO;

import java.math.BigDecimal;
import java.util.List;

public interface IProductService {

    ProductDTO queryProduct (ProductDTO product);
    List<ProductDTO> queryAllProducts();

    int insertProduct(ProductDTO productDTO);
    int updateProduct(ProductDTO productDTO);
    int deleteProduct(ProductDTO productDTO);

    int buyProduct (ProductDTO product, int quantity);

    // calculateTotalBuyAndDecreaseStock()
    // que el elemento llame a buyProduct
    BigDecimal calculateTotalPriceAndDecreaseStock(ProductDTO productDTO, int quantity);
}
