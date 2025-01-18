package net.ensah.productservice.dto.requests;

public record ProductRequest(String name,String description,String category,double price,String imageUrl) {
}
