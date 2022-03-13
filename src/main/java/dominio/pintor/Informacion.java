package dominio.pintor;

import co.com.sofka.domain.generic.Entity;
import dominio.pintor.values.ExperienciaPintor;
import dominio.pintor.values.InformacionID;
import dominio.pintor.values.NombrePintor;

public class Informacion extends Entity<InformacionID> {

    protected NombrePintor nombrePintor;
    protected ExperienciaPintor experienciaPintor;


    public Informacion(InformacionID entityId, NombrePintor nombrePintor, ExperienciaPintor experienciaPintor) {
        super(entityId);
        this.experienciaPintor = experienciaPintor;
        this.nombrePintor = nombrePintor;
    }

    public String consultarInformacion(){
        return "El nombre del Pintor es " + this.nombrePintor + " y su experiencia es " + this.experienciaPintor;
    }

    public NombrePintor getNombrePintor(){
        return this.nombrePintor;
    }
}
