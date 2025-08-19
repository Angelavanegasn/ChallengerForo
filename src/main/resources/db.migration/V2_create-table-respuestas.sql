CREATE TABLE respuestas (
    id BIGSERIAL PRIMARY KEY,
    mensaje VARCHAR(500) NOT NULL,
    autor VARCHAR(100) NOT NULL,
    fecha_creacion TIMESTAMP NOT NULL DEFAULT NOW(),
    id_topico BIGINT NOT NULL,
    CONSTRAINT fk_respuestas_topicos FOREIGN KEY (id_topico) REFERENCES topicos(id) ON DELETE CASCADE
);
