package VolBank;

import java.util.ArrayList;

public class Listas{
    private static ArrayList<Necesidad> listaNecesidades = new ArrayList<>();
    private static ArrayList<Voluntario> listaVoluntarios = new ArrayList<>();
    private static ArrayList<OrganizacionVoluntarios> ListaOrganizaciones = new ArrayList<>();

    public static void addVoluntario(Voluntario v){
        listaVoluntarios.add(v);
    }
    public static void addOrganizaciones(OrganizacionVoluntarios ov){
        ListaOrganizaciones.add(ov);
    }
    public static void addListaNecesidades(Necesidad n){
        listaNecesidades.add(n);
    }
    public static ArrayList<Necesidad> getListaNecesidades() {
        return listaNecesidades;
    }
    public static ArrayList<Voluntario> getListaVoluntarios() {
        return listaVoluntarios;
    }
    public static ArrayList<OrganizacionVoluntarios> getListaOrganizaciones() {
        return ListaOrganizaciones;
    }
}