package com.example.sprint_2_api.model.order;
import com.example.sprint_2_api.model.product.Product;
import javax.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@Getter
@Setter
@NoArgsConstructor
public class OrderDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Double priceOrder;
    private Integer quantity;

    @ManyToOne
    @JoinColumn(name = "idOrder",referencedColumnName = "id")
    private Order order;

    @ManyToOne
    @JoinColumn(name = "idProduct",referencedColumnName = "id")
    private Product product;
}
