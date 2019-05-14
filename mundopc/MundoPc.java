/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mundopc;

import com.p2.mundopc.Computadora;
import com.p2.mundopc.Monitor;
import com.p2.mundopc.Orden;
import com.p2.mundopc.Raton;
import com.p2.mundopc.Teclado;


/**
 *
 * @author Hp Pc
 */
public class MundoPc {


    public static void main(String[] args) {
        Teclado t1= new Teclado("USB", "Inova");
        Teclado t2= new Teclado("USB", "Kolke");
        Teclado t3= new Teclado("USB", "LG");
        Teclado t4= new Teclado("PS/2", "GENIUS");
        Teclado t5= new Teclado("PS/2", "SAMSUNG");
        
        Raton r1= new Raton("USB","GENIUS");
        Raton r2= new Raton("USB","KOLKE");
        Raton r3= new Raton("USB","LENOVO");
        Raton r4= new Raton("USB","HP");
        Raton r5= new Raton("USB","ASUS");
        
        Monitor m1= new Monitor("LG", 2.3);
        Monitor m2= new Monitor("HP", 10.3);
        Monitor m3= new Monitor("BGH", 23.3);
        Monitor m4= new Monitor("HITACHI", 9.0);
        Monitor m5= new Monitor("SAMSUNG", 12.7);
        
        Computadora compu1= new Computadora("pc gamer",m1,r1,t1,80000);
        Computadora compu2=new Computadora("pc ejecutiva", m3, r4, t2, 45000);
        Computadora compu3=new Computadora("pc standar", m2, r5, t3, 56000.00);
        Computadora compu4=new Computadora("pc personal", m4, r3, t4, 30000.00);
        Computadora compu5=new Computadora("pc standar 2", m5, r2, t5, 35000.00);
        Computadora compu6=new Computadora("pc ejecutiva 2", m1, r1, t1, 12000.00);
        Computadora compu7=new Computadora("pc gamer 2", m2, r5, t2, 35600.00);
        
        Orden orden1= new Orden();
        Orden orden2= new Orden();
        Orden orden3= new Orden();
        Orden orden4= new Orden();
        
        orden1.agregarComputadora(compu7);
        orden1.agregarComputadora(compu1);
        orden2.agregarComputadora(compu3);
        orden2.agregarComputadora(compu1);
        orden2.agregarComputadora(compu4);
        orden3.agregarComputadora(compu6);
        orden3.agregarComputadora(compu1);
        orden4.agregarComputadora(compu7);
        orden4.agregarComputadora(compu5);
        orden4.agregarComputadora(compu3);
    
        orden1.mostrarOrden();
        System.out.println("");
        orden2.mostrarOrden();
        System.out.println("");
        orden3.mostrarOrden();
        System.out.println("");
        orden4.mostrarOrden();
        
        
    }
    
}
