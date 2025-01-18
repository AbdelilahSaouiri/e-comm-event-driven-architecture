package net.ensah.orderservice.entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor @NoArgsConstructor @Builder
public class OrderItem {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String productId;
    private int quantity;
    private double price;
    @ManyToOne
    @JoinColumn(name = "order_id", nullable = false)
    private Order order;
}
