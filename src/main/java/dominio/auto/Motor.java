package dominio.auto;

import co.com.sofka.domain.generic.Entity;
import dominio.auto.values.Bujia;
import dominio.auto.values.Carter;
import dominio.auto.values.Cilindros;
import dominio.auto.values.MotorID;

public class Motor extends Entity<MotorID> {

protected Carter carter;
protected Cilindros cilindros;
protected Bujia bujia;

    public Motor(MotorID entityId, Carter carter, Cilindros cilindros, Bujia bujia) {
        super(entityId);
        this.carter = carter;
        this.bujia = bujia;
        this.cilindros = cilindros;
    }
}
