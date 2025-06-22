package com.project.backend.domain.mapper;

import com.project.backend.codegen.types.Accessibility;
import com.project.backend.codegen.types.CreateAccessibility;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Service;

@Service
@Mapper(componentModel = "spring")
public interface CreateAccessibilityMapper {
    Accessibility map(CreateAccessibility createAccessibility);
}
