package VolBank;

public class Voluntario extends Usuario {
    private String skills;

    Voluntario(String name, String cp,String skills){
        super(name, cp);
        this.skills=skills;
    }
    
    public String getSkills(){
        return skills;
    }
}