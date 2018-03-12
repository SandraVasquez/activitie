package arraylist;

import javax.swing.JOptionPane;
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author UTBIS
 */
public class ArrayList extends wagen{
    public static void main (String args[]){
        wagen Wagen1 = new wagen("Camaro ZL1","Black",true,"",4);
        wagen Wagen2 = new wagen("Mustang","Gray",false,"",2);
        ArrayList <wagen> List= new ArrayList <wagen>();//No encuentro el error de parametros
        
        List.add(Wagen1);
        List.add(Wagen2);
        boolean flag=true;
        do{
            int option=Integer.parseInt(JOptionPane.showInputDialog(null,"Menu"
            +"1) Imprimir autos"
            +"2) Modificar auto"
            +"3) Salir"
            +"--------------------------"
            +"0) Añadir auto"));
            
            switch(option){
                case 1:
                    for (int i=0; i < List.size(); i++){
                        System.out.println(List.get(i).getName);
                        System.out.println(List.get(i).getColor);
                        System.out.println(List.get(i).getStatus);
                        System.out.println(List.get(i).getid);
                        System.out.println(List.get(i).getPersonas);
                    }//imprimirá cada elemento de cada objeto
                    break;
                case 2:
                    int op=Integer.parseInt(JOptionPane.showInputDialog(null,"¿Qué desea modificar?"
            +"1) Color"
            +"2) Status"
            +"3) # de Personas"));
                    
                    switch(op){
                        case 1:
                            int a = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el indice a Modificar: "));
                            String b = JOptionPane.showInputDialog(null, "Nuevo color: ");
                            List.set(a,b);
                            break;
                        case 2:
                            int a1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el indice a Modificar: "));
                            int b1 = Integer.parseInt(JOptionPane.showInputDialog("Nuevo Status: "
                            +"1)Encendido"
                            +"2)Apagado"));
                            
                            if(b1==1){
                                List.set(a1,true);
                            }
                            else{
                                List.set(a1,false);
                            }
                            break;
                        case 3:
                            int x = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el indice a Modificar: "));
                            int y = Integer.parseInt(JOptionPane.showInputDialog(null, "Reciente número de personas dentro: "));
                            List.set(x,y);
                            break;
                    }//end of switch op
                   break;//end of case 
                        case 3:
                            break;
                        case 0:
                            
                            break;
            }//end of switch option
        }//end of do
        while(flag);
    }
}
