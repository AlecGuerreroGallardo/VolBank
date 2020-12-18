package VolBank;

public class Usuario {
    private String name;
    private String cp;

    Usuario(String name, String cp){
        this.name = name;
        this.cp = cp;
    }

    public String getName(){
        return name;
    }

    public String getCp(){
        return cp;
    }
}