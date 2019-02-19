/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin22;

import java.util.ArrayList;

/**
 *
 * @author slorenzorodriguez
 */

/*
 Define a clase Buzon para xestionar unbuzon de correo  electrónicos ordenados segundo a orde de chegada.
Para representar o buzon de correo úsase un array de correos electrónicos; estes, á súa vez, son obxectos da clase Correo 
e teñen como atributos un String, co contido do correo, e un indicativo para saber se foron lidos ou non.
Define a clase Correo cos métodos que creas convenientes, sabendo que a clase Buzon debe incluír os seguintes métodos públicos:

a) int numeroDeCorreos(), que calcula cantos correos hai no buzon de correo
b) void engade (Correo c), que engade c ao buzon
c) boolean porLer(), que determina se quedan correos por ler
d) String amosaPrimerNoLeido(), que amostra o primeiro correo non lido
e) String amosa(int k), que amostra o correo k-ésimo, fora lido ou non
f) void elimina(int k), que elimina o correo k-ésimo.
*/

public class Buzon {
    private ArrayList<Correo> lista;

    public Buzon(ArrayList<Correo> lista) {
        this.lista = lista;
    }
    
    public int numeroDeCorreo(){
        return lista.size();
    }
    public void engade (Correo c){
        lista.add(c);
    }
    public boolean porLer(){
        boolean comprobar = true;
        for (Correo c : lista){
            if (c.isLido()==false) {
               comprobar = false;
            }
        
        }
        return comprobar;
    }
    public String amosaPrimerNoLeido(){
        for (Correo c : lista){
            if (c.isLido()==false){
                return c.getContido();
            }
           
        }
        return "No hay mensaje sin leer";
        
    }
    public String amosa(int k){
        return lista.get(k).getContido();
        
    }
    public void elimina(int k){
        lista.remove(k);
    }
    
}
    
    
    

