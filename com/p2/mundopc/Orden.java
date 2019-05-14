
package com.p2.mundopc;



public class Orden {
    private final int idOrden;
    private final Computadora computadoras[];
    private static int contadorOrdenes;
    private int contadorComputadoras;
    private static final int MAX_COMPUTADORAS=10;

    public Orden() {
        this.idOrden= ++contadorOrdenes;
        computadoras= new Computadora[MAX_COMPUTADORAS];
        
    }
    
    public void agregarComputadora(Computadora computadora){
        if( contadorComputadoras < MAX_COMPUTADORAS ){
            this.computadoras[contadorComputadoras++] = computadora;
        }
        else{
            System.out.println("Se ha superado el maximo de productos"+MAX_COMPUTADORAS);
        }
        
    }
    
    public double calcularTotal(){
     double total=0;
         for(int i=0; i<contadorComputadoras;i++){
    total +=computadoras[i].getPrecio();
    }
    return total;
    }
    
    public void mostrarOrden(){
        System.out.println("Orden #:"+ idOrden);
        System.out.println("Total de la orden #"+ idOrden+ ": $"+ calcularTotal());
        System.out.println("Productos de la orden #"+ idOrden+ ":");
      
        for(int i=0;i<contadorComputadoras;i++){
           System.out.println(computadoras[i]);}

    }
    

    public static void setContadorOrdenes(int contadorOrdenes) {
        Orden.contadorOrdenes = contadorOrdenes;
    }
    

    public int getIdOrden() {
        return idOrden;
    }

    public int getContadorOrdenes() {
        return contadorOrdenes;
    }
//
//    public void setContadorOrdenes(int contadorOrdenes) {
//        this.contadorOrdenes = contadorOrdenes;
//    }

    public int getContadorComputadoras() {
        return contadorComputadoras;
    }

    public void setContadorComputadoras(int contadorComputadoras) {
        this.contadorComputadoras = contadorComputadoras;
    }

    public int getMAX_COMPUTADORAS() {
        return MAX_COMPUTADORAS;
    }

    public Computadora[] getComputadoras() {
        return computadoras;
    }
    

    @Override
    public String toString() {
        return "Orden{" + "idOrden=" + idOrden + ", computadoras=" + computadoras + ", contadorComputadoras=" + contadorComputadoras + '}';
    }
    }

    

