/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class wagen {
    private String Name;
    private String Color;
    private boolean Status;
    private String id;
    private int Personas;
    
    public wagen (String Name,String Color,boolean Status,String id,int Personas){
        this.Name=Name;
        this.Color=Color;
        this.Status=Status;
        this.id=id;
        this.Personas=Personas;
    }

    wagen() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void Color(String a){
        this.Color=a;
    }
    
    public String getColor() {
        return Color;
    }
    
    public void Status(boolean b){
        this.Status=b;
    }

    public boolean isStatus() {
        return Status;
    }
    
    public void Personas(int c){
        this.Personas=c;
    }

    public int getPersonas() {
        return Personas;
    }

    public void setPersonas(int Personas) {
        this.Personas = Personas;
    }
    
    public void Name (String d){
        this.Name=d;
    }
    
    public void id (String e){
        this.id=e;
    }
    
}
