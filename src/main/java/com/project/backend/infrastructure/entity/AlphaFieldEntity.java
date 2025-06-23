package com.project.backend.infrastructure.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Entity
@Table(name = "alpha_fields")
public class AlphaFieldEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String name;
    private String value;
    // TODO: alpha_source_id is null
    @ManyToOne
    @JoinColumn(name = "alpha_source_id")
    private AlphaSourceEntity alphaSourceEntity;

    public AlphaFieldEntity() {}

    public AlphaFieldEntity(String id, String name, String value, AlphaSourceEntity alphaSourceEntity) {
        this.id = id;
        this.name = name;
        this.value = value;
        this.alphaSourceEntity = alphaSourceEntity;
    }
}
