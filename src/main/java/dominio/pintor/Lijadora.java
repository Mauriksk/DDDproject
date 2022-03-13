package dominio.pintor;

import co.com.sofka.domain.generic.Entity;
import dominio.pintor.values.LijadoraID;
import dominio.pintor.values.Masilla;

public class Lijadora extends Entity<LijadoraID> {

    protected Masilla masilla;

    public Lijadora(LijadoraID entityId, Masilla masilla) {
        super(entityId);
        this.masilla = masilla;
    }
}
