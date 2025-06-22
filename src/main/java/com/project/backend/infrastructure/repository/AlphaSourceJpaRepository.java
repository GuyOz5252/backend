package com.project.backend.infrastructure.repository;

import com.project.backend.infrastructure.entity.AlphaSourceEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlphaSourceJpaRepository extends JpaRepository<AlphaSourceEntity, String> {}
