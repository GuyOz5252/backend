package com.project.backend.application.alphasource.create;

import com.project.backend.codegen.types.AlphaSource;
import com.project.backend.shared.Command;

public record CreateAlphaSourceCommand(AlphaSource alphaSource) implements Command<String> {
}
