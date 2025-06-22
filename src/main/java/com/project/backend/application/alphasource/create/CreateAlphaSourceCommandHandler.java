package com.project.backend.application.alphasource.create;

import com.project.backend.domain.abstraction.AlphaSourceRepository;
import com.project.backend.shared.CommandHandler;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.OffsetDateTime;
import java.util.Optional;

@AllArgsConstructor
@Service
public class CreateAlphaSourceCommandHandler implements CommandHandler<CreateAlphaSourceCommand, String> {
    private final AlphaSourceRepository alphaSourceRepository;

    @Override
    public Optional<String> handle(CreateAlphaSourceCommand command) {
        // TODO: validation
        // TODO: set proper accessibility category
        // TODO: check for auto approval
        // TODO: generate custom ids

        command.alphaSource().setUpdatedAt(OffsetDateTime.now());

        var id = alphaSourceRepository.create(command.alphaSource());
        return Optional.of(id);
    }
}
