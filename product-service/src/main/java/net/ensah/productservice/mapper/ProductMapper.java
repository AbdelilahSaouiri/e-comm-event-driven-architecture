package net.ensah.productservice.mapper;


import net.ensah.productservice.dto.requests.ProductRequest;
import net.ensah.productservice.dto.responses.ProductResponse;
import net.ensah.productservice.entity.Product;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProductMapper {

    ProductResponse  productToProductResponse(Product product);
    Product productRequestToProduct(ProductRequest productRequest);
    List<ProductResponse> productListToProductResponseList(List<Product> productList);
    List<Product> productRequestListToProductList(List<ProductRequest> productRequestList);
}
