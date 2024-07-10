CREATE TABLE IF NOT EXISTS users_profiles (
    user_id BIGINT NOT NULL,
    profile_id BIGINT NOT NULL,
    PRIMARY KEY (user_id, profile_id),
    FOREIGN KEY (user_id) REFERENCES users(id) ON DELETE CASCADE,
    FOREIGN KEY (profile_id) REFERENCES profiles(id) ON DELETE CASCADE
);


ALTER TABLE answers
ADD COLUMN topic_id BIGINT NOT NULL REFERENCES topics(id),
ADD COLUMN  user_id BIGINT NOT NULL REFERENCES users(id)
;


ALTER TABLE topics
ADD COLUMN user_id BIGINT NOT NULL REFERENCES users(id),
ADD COLUMN course_id BIGINT NOT NULL REFERENCES courses(id)
;