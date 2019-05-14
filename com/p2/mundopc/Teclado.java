
package com.p2.mundopc;


public class Teclado extends DispositivoEntrada{
    
    private int idTeclado;
    private static int contadorTeclados;

    public Teclado(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
        this.idTeclado=++contadorTeclados;
    }

    public int getIdTeclado() {
        return idTeclado;
    }

    public int getContadorTeclados() {
        return contadorTeclados;
    }

    public void setContadorTeclados(int contadorTeclados) {
        this.contadorTeclados = contadorTeclados;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }



    
    

  
    
    
    
}
