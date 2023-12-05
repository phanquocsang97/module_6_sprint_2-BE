package com.example.sprint_2_api.repository.cart;

import com.example.sprint_2_api.dto.cart.ICartDto;
import com.example.sprint_2_api.model.order.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface ICartRepository extends JpaRepository<Cart, Long> {

    @Modifying
    @Transactional
    @Query(value = "insert into cart (quantity_order,id_user,id_product) " +
            "values (:#{#cart.quantityOrder},:#{#cart.appUser.id},:#{#cart.product.id}) " +
            "on duplicate key update quantity_order = :#{#cart.quantityOrder}",nativeQuery = true)
    void addToCart(Cart cart);

    @Modifying
    @Transactional
    @Query(value = "delete from cart where id_user = :idUser and id_product = :idProduct",nativeQuery = true)
    void deleteProduct(@Param("idUser") Long idUser,@Param("idProduct") Long idProduct);

    @Modifying
    @Transactional
    @Query(value = "delete from cart where id_user = :id",nativeQuery = true)
    void deleteCart(@Param("id") Long userId);

    @Query(value = "SELECT " +
            "    c.id AS idCart, " +
            "    c.id_user AS idUser, " +
            "    c.id_product AS idProduct," +
            "    c.quantity_order as quantity," +
            "    p.quantity as maxQuantity, " +
            "    p.name, " +
            "    p.price, " +
            "    p.price_sale AS priceSale, " +
            "    MIN(i.name) AS image " +
            "FROM " +
            "    cart AS c " +
            "        JOIN " +
            "    product AS p ON p.id = c.id_product " +
            "        JOIN " +
            "    image AS i ON p.id = i.id_product " +
            "WHERE " +
            "        c.id_user = :id " +
            "GROUP BY " +
            "    c.id , c.id_user, c.id_product, c.quantity_order, p.name, p.price, p.price_sale;", nativeQuery = true)
    List<ICartDto> getAllCart(@Param("id") Long idUser);


}
