package net.ensah.productservice.dto.responses;

public record ProductResponse(
        String id,
        String name,
        String description,
        String category,
        double price,
        String imageUrl) {
}
