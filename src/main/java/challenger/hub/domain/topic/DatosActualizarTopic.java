package challenger.hub.domain.topic;

public record DatosActualizarTopic(
    
        String titulo,
        String autor,
        String mensaje,
        Curso curso,
        String status
) {
}
