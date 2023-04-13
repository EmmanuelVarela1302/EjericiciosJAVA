
package cafeteria;

import cafeteria.Entidad.Cafetera;
import cafeteria.Servicio.CafeteraServicio;


public class Cafeteria {

   
    public static void main(String[] args) {
        Cafetera cafetera = new Cafetera();
         CafeteraServicio sv = new CafeteraServicio();
          cafetera.setCapacidadMaxima(500);
           sv.llenarCafetera(cafetera);
                sv.servirTaza(cafetera);
                sv.vaciarCafetera(cafetera);
                sv.agregarCafe(cafetera);
    }
    
}
