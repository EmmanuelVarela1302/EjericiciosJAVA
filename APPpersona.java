
package apppersona;

import apppersona.ENTIDAD.Persona;
import apppersona.SERVICIO.PersonaServicio;


public class APPpersona {

    public static void main(String[] args) {
        Persona[] personas = new Persona[4];
        boolean[] mayoresDeEdad = new boolean[4];
        int[] estadosIMC = new int[4];
        PersonaServicio servicio = new PersonaServicio();

        for (int i = 0; i < personas.length; i++) {
            System.out.println("Ingrese los datos de la persona " + (i+1));
            personas[i] = servicio.crearPersona();
            mayoresDeEdad[i] = servicio.esMayorDeEdad(personas[i]);
            estadosIMC[i] = servicio.calcularIMC(personas[i]);
        }

        int numPersonasEnPesoIdeal = 0;
        int numPersonasConSobrepeso = 0;
        int numPersonasBajoPesoIdeal = 0;
        int numPersonasMayoresDeEdad = 0;
        int numPersonasMenoresDeEdad = 0;

        for (int i = 0; i < personas.length; i++) {
            if (estadosIMC[i] == 0) {
                numPersonasEnPesoIdeal++;
            } else if (estadosIMC[i] == 1) {
                numPersonasConSobrepeso++;
            } else if (estadosIMC[i] == -1) {
                numPersonasBajoPesoIdeal++;
            }

            if (mayoresDeEdad[i]) {
                numPersonasMayoresDeEdad++;
            } else {
                numPersonasMenoresDeEdad++;
            }
        }

        double porcentajePersonasEnPesoIdeal = (double)numPersonasEnPesoIdeal / personas.length * 100;
        double porcentajePersonasConSobrepeso = (double)numPersonasConSobrepeso / personas.length * 100;
        double porcentajePersonasBajoPesoIdeal = (double)numPersonasBajoPesoIdeal / personas.length * 100;
        double porcentajePersonasMayoresDeEdad = (double)numPersonasMayoresDeEdad / personas.length * 100;
        double porcentajePersonasMenoresDeEdad = (double)numPersonasMenoresDeEdad / personas.length * 100;

        System.out.println("Porcentaje de personas en peso ideal: " + porcentajePersonasEnPesoIdeal + "%");
        System.out.println("Porcentaje de personas con sobrepeso: " + porcentajePersonasConSobrepeso + "%");
        System.out.println("Porcentaje de personas por debajo de su peso ideal: " + porcentajePersonasBajoPesoIdeal + "%");
        System.out.println("Porcentaje de personas mayores de edad: " + porcentajePersonasMayoresDeEdad + "%");
        System.out.println("Porcentaje de personas menores de edad: " + porcentajePersonasMenoresDeEdad + "%");
        
    
    
}
}
