public class Servicio {

    private boolean enMantenimiento;
    private boolean aptoInfantil;
    private boolean aptoInclusivo;

    public void setEnMantenimiento(){
        this.enMantenimiento = true;
    }

    public void setAptoInfantil(){
        this.aptoInfantil = true;
    }

    public void setAptoInclusivo(){
        this.aptoInclusivo = true;
    }

    public boolean estaEnMantenimiento(){
        return this.enMantenimiento;
    }

    public boolean esAptoInfantil(){
        return this.aptoInfantil;
    }

    public boolean esAptoInclusivo(){
        return this.aptoInclusivo;
    }

}
