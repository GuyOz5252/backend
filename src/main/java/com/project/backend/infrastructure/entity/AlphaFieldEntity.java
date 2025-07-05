package com.project.backend.infrastructure.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
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
}
