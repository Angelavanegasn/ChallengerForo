package challenger.hub.domain.topic;

import challenger.hub.domain.respuesta.Respuesta;
import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Table(name = "topicos")
@Entity(name = "Topico")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Topico{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String autor;
    private String mensaje;
    @Enumerated(EnumType.STRING)
    private Curso curso;
    private LocalDateTime fechaCreacion;
    @OneToMany(mappedBy = "topico", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<Respuesta> respuestasL = new HashSet<>();
    @Setter
    private Integer respuestas;
    private String status;

    public Topico(DatosAgregarTopic datosRegistroTopico) {
        this.titulo = datosRegistroTopico.titulo();
        this.autor = datosRegistroTopico.autor();
        this.mensaje = datosRegistroTopico.mensaje();
        this.curso = datosRegistroTopico.curso();
        this.fechaCreacion = LocalDateTime.now();
        this.respuestas = 0;
        this.status = "ABIERTO";
    }
}