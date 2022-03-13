package dominio.auto;

import co.com.sofka.domain.generic.AggregateEvent;
import dominio.auto.values.AutoArreglado;
import dominio.auto.values.AutoID;
import dominio.auto.values.AutoPintado;

public class Auto extends AggregateEvent<AutoID> {

    protected Caracteristicas caracteristicas;
    protected Motor motor;
    protected TanqueCombustible tanqueCombustible;
    protected AutoArreglado autoArreglado;
    protected AutoPintado autoPintado;

    public Auto(AutoID entityId, Caracteristicas caracteristicas, Motor motor, TanqueCombustible tanqueCombustible,AutoPintado autoPintado, AutoArreglado autoArreglado) {
        super(entityId);
        this.caracteristicas = caracteristicas;
        this.motor = motor;
        this.tanqueCombustible = tanqueCombustible;
        this.autoArreglado = autoArreglado;
        this.autoPintado = autoPintado;
    }
}
