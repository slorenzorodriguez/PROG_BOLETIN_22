/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin22;

/**
 *
 * @author slorenzorodriguez
 */
public class Correo {
   private String Contido;
   private boolean lido;

    public Correo() {
    }

    public Correo(String Contido, boolean lido) {
        this.Contido = Contido;
        this.lido = lido;
    }

    public String getContido() {
        return Contido;
    }

    public void setContido(String Contido) {
        this.Contido = Contido;
    }

    public boolean isLido() {
        return lido;
    }

    public void setLido(boolean lido) {
        this.lido = lido;
    }

}

