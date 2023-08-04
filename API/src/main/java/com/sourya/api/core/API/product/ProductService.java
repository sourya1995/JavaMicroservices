package com.sourya.api.core.API.product;

public interface ProductService {

    @GetMapping(
        value = "/product/{productId}",
        produces = "application/json"
    )
    Product getProduct(@PathVariable int productId);
    
}
