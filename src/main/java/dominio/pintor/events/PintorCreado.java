package dominio.pintor.events;

import co.com.sofka.domain.generic.DomainEvent;
import dominio.pintor.values.NombrePintor;


public class PintorCreado extends DomainEvent {

    private final NombrePintor nombre;

    public PintorCreado(NombrePintor nombre) {
        super("taller.Pintor.Pintorcreado");
        this.nombre = nombre;
    }

    public NombrePintor getNombre(){
        return nombre;
    }
}
