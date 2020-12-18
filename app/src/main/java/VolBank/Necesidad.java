package VolBank;

public class Necesidad {
    OrganizacionVoluntarios beneficiado;
    int id;
    String fechaInicial;
    String fechaFinal;

    public Necesidad(int id, String fechaInicial, String fechaFinal, OrganizacionVoluntarios beneficiado) {
        this.id = id;
        this.fechaInicial=fechaInicial;
        this.fechaFinal=fechaFinal;
        this.beneficiado=beneficiado;
    }

    public String toString(){
        return beneficiado.getName()+" nececita "+beneficiado.getNecessities()+" en las fechas "+ this.fechaFinal+" - "+this.fechaFinal;
    }
    public void push(){
        Listas.addListaNecesidades(this);
    }
}