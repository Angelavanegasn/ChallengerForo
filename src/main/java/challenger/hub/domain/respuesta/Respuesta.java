package challenger.hub.domain.respuesta;

import challenger.hub.domain.topic.Topico;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;


import jakarta.persistence.*;
import lombok.*;


@Table(name = "respuestas")
@Entity(name = "Respuesta")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Respuesta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String mensaje;
    private String autor;
    private LocalDateTime fechaCreacion;
    @Setter
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_topico")
    private Topico topico;

    public Respuesta(DatosRespuesta datosRespuesta) {
        this.mensaje = datosRespuesta.mensaje();
        this.autor = datosRespuesta.autor();
        this.fechaCreacion = LocalDateTime.now();
    }

}
