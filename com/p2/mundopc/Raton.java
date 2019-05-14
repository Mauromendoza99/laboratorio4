
package com.p2.mundopc;


public class Raton extends DispositivoEntrada{
    private int idRaton;
    private static int contadorRatones;

    public Raton(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
        this.idRaton=++contadorRatones;
    }

    public int getIdRaton() {
        return idRaton;
    }

    public int getContadorRatones() {
        return contadorRatones;
    }

    public void setContadorRatones(int contadorRatones) {
        this.contadorRatones = contadorRatones;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }




    
    
    
}
