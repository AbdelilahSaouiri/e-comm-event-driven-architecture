package net.ensah.notificationservice.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import net.ensah.notificationservice.enums.NotificationType;

import java.time.LocalDateTime;

@Entity
@AllArgsConstructor @NoArgsConstructor @Builder
public class Notification {
    @Id
    private String id;
    private String userId;
    private String message;
    @Enumerated(EnumType.STRING)
    private NotificationType type;
    private boolean isRead;
    private LocalDateTime sentAt;
}