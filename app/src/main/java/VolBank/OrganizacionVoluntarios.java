package VolBank;

public class OrganizacionVoluntarios extends Usuario{
    private String necessities;

    OrganizacionVoluntarios(String name, String cp, String necessities) {
        super(name, cp);
        this.necessities=necessities;
    }
    public String getNecessities(){
        return necessities;
    }
}