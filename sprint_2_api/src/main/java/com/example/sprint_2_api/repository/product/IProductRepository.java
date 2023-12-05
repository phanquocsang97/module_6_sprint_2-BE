package com.example.sprint_2_api.repository.product;

import com.example.sprint_2_api.dto.product.ICategoriesDto;
import com.example.sprint_2_api.dto.product.IProductDto;
import com.example.sprint_2_api.model.order.Cart;
import com.example.sprint_2_api.model.product.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface IProductRepository extends JpaRepository<Product, Long> {

    @Query(value = "SELECT c.id as id, c.name as name FROM category c", nativeQuery = true)
    List<ICategoriesDto> findAllCategories();

    @Query(value = "SELECT p.id,p.quantity ,p.name AS name,c.name as nameCategory, p.price AS price, p.price_sale as priceSale, MIN(i.name) AS image " +
            "FROM image AS i " +
            "JOIN product AS p " +
            "ON p.id = i.id_product " +
            "JOIN category AS c " +
            "ON p.id_category = c.id " +
            "WHERE p.price BETWEEN :min AND :max " +
            "GROUP BY p.id", nativeQuery = true)
    Page<IProductDto> findAllProduct(Pageable pageable, @Param("min") double min, @Param("max") double max);



}
