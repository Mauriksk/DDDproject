package dominio.mecanico;

import co.com.sofka.domain.generic.Entity;
import dominio.mecanico.values.Destornillador;
import dominio.mecanico.values.HerramientasID;
import dominio.mecanico.values.Llave;
import dominio.mecanico.values.Soldadora;

public class Herramientas extends Entity<HerramientasID> {

    protected Llave llave;
    protected Soldadora soldadora;
    protected Destornillador destornillador;

    public Herramientas(HerramientasID entityId, Llave llave, Soldadora soldadora, Destornillador destornillador) {
        super(entityId);
        this.destornillador = destornillador;
        this.llave = llave;
        this.soldadora = soldadora;
    }
}
