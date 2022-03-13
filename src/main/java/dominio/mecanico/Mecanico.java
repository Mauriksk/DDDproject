package dominio.mecanico;

import co.com.sofka.domain.generic.AggregateEvent;
import dominio.mecanico.values.MecanicoID;

public class Mecanico extends AggregateEvent<MecanicoID> {

    protected Informacion informacion;
    protected Herramientas herramientas;

    public Mecanico(MecanicoID entityId, Informacion informacion, Herramientas herramientas) {
        super(entityId);
        this.herramientas = herramientas;
        this.informacion = informacion;
    }
}
