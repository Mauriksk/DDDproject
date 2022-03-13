package dominio.mecanico;

import co.com.sofka.domain.generic.Entity;
import dominio.mecanico.values.ExperienciaMecanico;
import dominio.mecanico.values.InformacionID;
import dominio.mecanico.values.NombreMecanico;

public class Informacion extends Entity<InformacionID> {

    protected NombreMecanico nombreMecanico;
    protected ExperienciaMecanico experienciaMecanico;

    public Informacion(InformacionID entityId, NombreMecanico nombreMecanico, ExperienciaMecanico experienciaMecanico) {
        super(entityId);
    }
}
