
package com.p2.mundopc;


public class Computadora {
    private int idCoomputadora;
    private static int contadorComputadoras;
    private String nombre;
    private Monitor Monitor;
    private Raton Raton;
    private Teclado Teclado;
    private double precio;

    private Computadora() {
        this.idCoomputadora = ++contadorComputadoras;
    }

    public Computadora(String nombre, Monitor Monitor, Raton Raton, Teclado Teclado, double precio) {
        this.idCoomputadora= ++contadorComputadoras;
        this.nombre = nombre;
        this.Monitor = Monitor;
        this.Raton = Raton;
        this.Teclado = Teclado;
        this.precio = precio;
        
    }

    public Computadora(String pc_gamer, Monitor m1, Teclado t1, Raton r1, int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    public int getIdCoomputadora() {
        return idCoomputadora;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Monitor getMonitor() {
        return Monitor;
    }

    public void setMonitor(Monitor Monitor) {
        this.Monitor = Monitor;
    }

    public Raton getRaton() {
        return Raton;
    }

    public void setRaton(Raton Raton) {
        this.Raton = Raton;
    }

    public Teclado getTeclado() {
        return Teclado;
    }

    public void setTeclado(Teclado Teclado) {
        this.Teclado = Teclado;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "\t" + "Coomputadora= " + idCoomputadora + ", nombre= " + nombre + "\n\t\tMonitor= " + Monitor + "\n\t\tRaton= " + Raton + "\n\t\tTeclado= " + Teclado + "\n\t\tprecio= $" + precio + "\n";
    }


    
    


    
    
    
}
