package net.ensah.paymentservice.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import net.ensah.paymentservice.enums.PaymentMethod;
import net.ensah.paymentservice.enums.PaymentStatus;

import java.time.LocalDateTime;

@Entity
@AllArgsConstructor @NoArgsConstructor @Builder
public class Payment {
    @Id
    private String id;
    private String orderId;
    private String userId;
    private double amount;
    @Enumerated(EnumType.STRING)
    private PaymentMethod paymentMethod;
    @Enumerated(EnumType.STRING)
    private PaymentStatus status;
    private LocalDateTime paymentDate;
}
