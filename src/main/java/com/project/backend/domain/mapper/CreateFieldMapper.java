package com.project.backend.domain.mapper;

import com.project.backend.codegen.types.CreateField;
import com.project.backend.codegen.types.Field;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Service;

@Service
@Mapper(componentModel = "spring")
public interface CreateFieldMapper {
    Field map(CreateField createField);
}
