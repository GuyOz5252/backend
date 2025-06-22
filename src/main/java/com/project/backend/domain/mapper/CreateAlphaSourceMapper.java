package com.project.backend.domain.mapper;

import com.project.backend.codegen.types.AlphaSource;
import com.project.backend.codegen.types.CreateAlphaSource;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Service;

@Service
@Mapper(componentModel = "spring", uses = {CreateAccessibilityMapper.class, CreateFieldMapper.class})
public interface CreateAlphaSourceMapper {
    AlphaSource map(CreateAlphaSource createAlphaSource);
}

