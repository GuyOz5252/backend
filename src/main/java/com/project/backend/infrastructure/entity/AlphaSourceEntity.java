package com.project.backend.infrastructure.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

import java.time.OffsetDateTime;
import java.util.List;

@Data
@Builder
@Entity
@Table(name = "alpha_sources")
public class AlphaSourceEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String name;
    private String description;
    private Integer depth;
    private String accessibilityName;
    private Integer accessibilityCategory;
    private String updatedBy;
    private OffsetDateTime updatedAt;
    private Boolean isApproved;
    private String approvedBy;
    private OffsetDateTime approvedAt;
    @OneToMany(mappedBy = "alphaSourceEntity", cascade = CascadeType.ALL)
    private List<AlphaFieldEntity> fields;

    protected AlphaSourceEntity() {}

    public AlphaSourceEntity(String id, String name, String description, Integer depth, String accessibilityName, Integer accessibilityCategory, String updatedBy, OffsetDateTime updatedAt, Boolean isApproved, String approvedBy, OffsetDateTime approvedAt, List<AlphaFieldEntity> fields) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.depth = depth;
        this.accessibilityName = accessibilityName;
        this.accessibilityCategory = accessibilityCategory;
        this.updatedBy = updatedBy;
        this.updatedAt = updatedAt;
        this.isApproved = isApproved;
        this.approvedBy = approvedBy;
        this.approvedAt = approvedAt;
        this.fields = fields;
    }
}
