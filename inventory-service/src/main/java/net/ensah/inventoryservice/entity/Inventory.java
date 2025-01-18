package net.ensah.inventoryservice.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@AllArgsConstructor @NoArgsConstructor @Builder
public class Inventory {
    @Id
    private String productId;
    private int quantity;
    private int reserved;
    private LocalDateTime lastUpdated;
}
