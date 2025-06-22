package com.project.backend.infrastructure.repository;

import com.project.backend.codegen.types.AlphaSource;
import com.project.backend.domain.abstraction.AlphaSourceRepository;
import com.project.backend.infrastructure.entity.AlphaSourceEntity;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class AlphaSourceJpaRepositoryAdapter implements AlphaSourceRepository {
    private final AlphaSourceJpaRepository alphaSourceJpaRepository;

    @Override
    public String create(AlphaSource alphaSource) {
        var alphaSourceEntity = alphaSourceJpaRepository.save(AlphaSourceEntity.builder()
                .name(alphaSource.getName())
                .description(alphaSource.getDescription())
                .depth(alphaSource.getDepth())
                .accessibilityName(alphaSource.getAccessibility().getName())
                .accessibilityCategory(alphaSource.getAccessibility().getCategory())
                .updatedBy(alphaSource.getUpdatedBy())
                .updatedAt(alphaSource.getUpdatedAt())
                .isApproved(alphaSource.getIsApproved())
                .approvedBy(alphaSource.getApprovedBy())
                .approvedAt(alphaSource.getApprovedAt())
                .build());
        return alphaSourceEntity.getId();
    }
}
