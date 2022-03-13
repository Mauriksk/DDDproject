package dominio.auto;

import co.com.sofka.domain.generic.Entity;
import dominio.auto.values.CaracteristicasID;
import dominio.auto.values.Modelo;
import dominio.auto.values.Seguro;
import dominio.auto.values.Year;

public class Caracteristicas extends Entity<CaracteristicasID> {

    protected Year year;
    protected Modelo modelo;
    protected Seguro seguro;

    public Caracteristicas(CaracteristicasID entityId, Year year, Modelo modelo, Seguro seguro) {
        super(entityId);
        this.year = year;
        this.modelo = modelo;
        this.seguro = seguro;
    }
}
