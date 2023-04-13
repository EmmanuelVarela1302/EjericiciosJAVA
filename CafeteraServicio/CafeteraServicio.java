
package cafeteria.Servicio;

import cafeteria.Entidad.Cafetera;
import java.util.Scanner;


public class CafeteraServicio {
    Scanner leer = new Scanner(System.in);
            
    public void llenarCafetera(Cafetera cafetera){
       System.out.println("Ingrese cantidad de cafe ( Capacidad maxima = 500 ML ) ");  
        cafetera.setCantidadActual(leer.nextInt());
       if (cafetera.getCantidadActual()<= cafetera.getCapacidadMaxima()){
        System.out.println("La cantidad actual de cafe es de " + cafetera.getCantidadActual()+ " ml");
       }else{
           System.out.println("La cantidad ingresada supera el limite, se llenara hasta su capacidad maxima.");
       }
        System.out.println("");
       System.out.println("-----------------------------------");
       System.out.println("Iniciando proceso = LLENAR CAFETERA");
         cafetera.setCantidadActual( cafetera.getCapacidadMaxima());
        System.out.println("Se ha llenado la cafetera a la capacidad maxima "+ cafetera.getCantidadActual()+ " ml");

    }
    public int servirTaza(Cafetera cafetera){
        System.out.println("");
        System.out.println("Ingrese tamaño de la taza en ml");
         int taza = leer.nextInt();
         if (taza<cafetera.getCantidadActual()){
         cafetera.setCantidadActual(cafetera.getCantidadActual()- taza);
             System.out.println("Se ha servido correctamente, la cantidad actual de la cafetera es de "+ cafetera.getCantidadActual()+ " ml" );
         } else {
             cafetera.setCantidadActual(0);
             System.out.println("Se ha servido todo el cafe disponible, la cantidad actual de la cafetera es de "+ cafetera.getCantidadActual()+ " ml");
               }
    return cafetera.getCantidadActual();
    }
    public void vaciarCafetera(Cafetera cafetera){
        cafetera.setCantidadActual(0);
        System.out.println("");
        System.out.println("Se ha vaciado la cafetera");
    }
public int agregarCafe ( Cafetera cafetera){
    System.out.println("");
    System.out.println("Ingrese cantida a agregar a la cafetera");
    cafetera.setCantidadActual(leer.nextInt());
    if (cafetera.getCantidadActual()<cafetera.getCapacidadMaxima()){
        System.out.println("La cantidad actual es de " + cafetera.getCantidadActual()+" ml");
    }else{
        cafetera.setCantidadActual(500);
        System.out.println("La cafetera se ha llenado a su capacidad maxima");
    }
    return cafetera.getCapacidadMaxima();
   }
}