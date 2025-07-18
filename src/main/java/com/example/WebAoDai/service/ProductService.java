package com.example.WebAoDai.service;

import com.example.WebAoDai.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface ProductService {
    List<Product> getAllProduct();

    Product saveProduct(Product product);

    Product getProductById(int id);

    Product updateProduct(Product product);

    void deleteProductById(int id);

    List<Product> getProducts();

    String tryOnClothes(Integer productId, MultipartFile selfie);

    List<Product> findByProduct_NameContaining(String name);

    List<Product> findTop12ProductBestSellers();

    List<Product> findTop12ProductNewArrivals();

    Page<Product> findAll(Pageable pageable);

    Page<Product> findByProduct_NameContaining(String name, Pageable pageable);

    Page<Product> findByProduct_NameAndCategory_idContaining(String name, int category_id, Pageable pageable);

    List<Product> findTop4ProductByCategory_id(int name);

    List<Product> getProductsByGender(String gender);

}
