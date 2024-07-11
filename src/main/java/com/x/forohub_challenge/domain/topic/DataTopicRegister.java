package com.x.forohub_challenge.domain.topic;

import jakarta.validation.constraints.NotBlank;

public record DataTopicRegister(
        @NotBlank
        String title,
        @NotBlank
        String message,
        @NotBlank
        String course
) {
}
