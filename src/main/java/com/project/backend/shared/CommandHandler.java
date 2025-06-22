package com.project.backend.shared;

import java.util.Optional;

public interface CommandHandler<TCommand extends Command<TResponse>, TResponse> {
    Optional<TResponse> handle(TCommand command);
}
