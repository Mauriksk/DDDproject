package dominio.pintor;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
//import dominio.pintor.events.AutoPintado;
import dominio.pintor.events.PintorCreado;
import dominio.pintor.values.PintorID;

import java.util.List;


public class Pintor extends AggregateEvent<PintorID> {

    protected Informacion informacion;
    protected Lijadora lijadora;
    protected PistolaElectrica pistolaElectrica;

    public Pintor(PintorID entityId, Informacion informacion, Lijadora lijadora, PistolaElectrica pistolaElectrica) {
        super(entityId);
        this.informacion = informacion;
        this.lijadora = lijadora;
        this.pistolaElectrica = pistolaElectrica;
        appendChange(new PintorCreado(informacion.nombrePintor)).apply();
    }

    private Pintor(PintorID entityId){
        super(entityId);
        subscribe(new PintorChange(this));
    }

    public static Pintor from(PintorID pintorID, List<DomainEvent> events){
        var pintor = new Pintor(pintorID);
        events.forEach(pintor::appendChange);
        return pintor;
    }


    /*public void pintar(){
    appendChange(new AutoPintado( pintar() ));
    }

     */

}
