package dominio.pintor;

import co.com.sofka.domain.generic.Entity;
import dominio.pintor.values.Pintura;
import dominio.pintor.values.PistolaID;

public class PistolaElectrica extends Entity<PistolaID> {

    protected Pintura pintura;

    public PistolaElectrica(PistolaID entityId, Pintura pintura) {
        super(entityId);
        this.pintura = pintura;
    }
}
