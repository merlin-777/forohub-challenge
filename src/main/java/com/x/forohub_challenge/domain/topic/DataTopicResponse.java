package com.x.forohub_challenge.domain.topic;

import java.time.LocalDateTime;

public record DataTopicResponse(
        Long id,
        String title,
        String message,
        LocalDateTime creationDate
) {
}
