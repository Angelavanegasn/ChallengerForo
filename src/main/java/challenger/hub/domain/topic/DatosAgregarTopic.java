package challenger.hub.domain.topic;

import org.antlr.v4.runtime.misc.NotNull;

public record DatosAgregarTopic (
        @NotNull
        String titulo,
        @NotNull
        String autor,
        @NotNull
        String mensaje,
        @NotNull
        Curso curso
) {
}

