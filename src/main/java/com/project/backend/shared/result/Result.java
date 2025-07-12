package com.project.backend.shared.result;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Result<T> {
    private final T value;
    @Getter
    private final Error error;
    private final boolean success;

    private static final Result<Void> VOID_SUCCESS = new Result<>(null, null, true);

    public static Result<Void> success() {
        return VOID_SUCCESS;
    }

    public static <T> Result<T> success(T value) {
        return new Result<>(value, null, true);
    }

    public static <T> Result<T> failure(String errorMessage) {
        return new Result<>(null, new Error(errorMessage), false);
    }

    @SuppressWarnings({})
    public boolean isSuccess() {
        return success;
    }

    public boolean isFailure() {
        return !success;
    }

    public T get() {
        if (isFailure()) {
            throw new IllegalStateException("Cannot get value from failure result");
        }
        return value;
    }
}
