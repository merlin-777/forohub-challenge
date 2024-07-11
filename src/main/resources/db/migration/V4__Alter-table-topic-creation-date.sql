ALTER TABLE topics
ALTER COLUMN creation_date TYPE TIMESTAMP;

-- Establecer el valor por defecto y la restricción NOT NULL
ALTER TABLE topics
ALTER COLUMN creation_date SET DEFAULT CURRENT_TIMESTAMP;

ALTER TABLE topics
ALTER COLUMN creation_date SET NOT NULL;