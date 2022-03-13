package dominio.auto;

import co.com.sofka.domain.generic.Entity;
import dominio.auto.values.CantidadCombustible;
import dominio.auto.values.MaxCombustible;
import dominio.auto.values.TanqueID;
import dominio.auto.values.TipoCombustible;

public class TanqueCombustible extends Entity<TanqueID> {

    protected CantidadCombustible cantidadCombustible;
    protected TipoCombustible tipoCombustible;
    protected MaxCombustible maxCombustible;

    public TanqueCombustible(TanqueID entityId, CantidadCombustible cantidadCombustible, TipoCombustible tipoCombustible, MaxCombustible maxCombustible) {
        super(entityId);
        this.cantidadCombustible = cantidadCombustible;
        this.maxCombustible = maxCombustible;
        this.tipoCombustible = tipoCombustible;
    }
}
