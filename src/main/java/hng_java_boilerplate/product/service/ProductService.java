package hng_java_boilerplate.product.service;

import hng_java_boilerplate.product.entity.Product;
import hng_java_boilerplate.product.exceptions.ProductNotFoundException;
import hng_java_boilerplate.product.exceptions.UnauthorizedAccessException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ProductService {

    //Method to Search for products with certain criteria, returns a list of products
    Page<Product> productsSearch(String name, String category, Double minPrice, Double maxPrice, Pageable pageable);

    void deleteProductById(String id) throws ProductNotFoundException, UnauthorizedAccessException;
}