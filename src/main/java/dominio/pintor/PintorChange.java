package dominio.pintor;

import co.com.sofka.domain.generic.EventChange;
import dominio.pintor.events.PintorCreado;

public class PintorChange extends EventChange {
    public PintorChange(Pintor pintor){
        apply( (PintorCreado event)-> {
            pintor.informacion.nombrePintor = pintor.informacion.getNombrePintor();
        } );


    }
}
