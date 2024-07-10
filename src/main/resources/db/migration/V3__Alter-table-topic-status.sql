ALTER TABLE topics DROP COLUMN status;

ALTER TABLE topics ADD COLUMN status BOOLEAN;

UPDATE topics SET status = CASE
    WHEN status IN ('true', 'TRUE', '1') THEN TRUE
    ELSE FALSE
END;
