
package Servicio;

import Entidad.CuentaBancaria;
import java.util.Scanner;


public class CuentaBancariaServicio {
    Scanner leer = new Scanner(System.in);
    
    public CuentaBancaria crearCuenta(){
        System.out.println("Ingrese numero cuenta");
        int  numeroCuenta= leer.nextInt();
        System.out.println("Ingrese numero DNI");
        long numeroDni = leer.nextLong();
        System.out.println("Ingrese monto actual");
       double saldoActual = leer.nextDouble();
        return new CuentaBancaria(numeroCuenta, numeroDni, saldoActual);
    }
public void ingresar(CuentaBancaria cuenta, double cantidad) {
        cuenta.setSaldoActual(cuenta.getSaldoActual() + cantidad);
        System.out.println("El dinero se ha depositado en la cuenta correctamente.");
    }

    public void retirar(CuentaBancaria cuenta, double cantidad) {
        if (cantidad > cuenta.getSaldoActual()) {
            System.out.println("No se puede retirar más dinero del que hay en la cuenta. Se retirará el máximo posible.");
            cantidad = cuenta.getSaldoActual();
        }
        cuenta.setSaldoActual(cuenta.getSaldoActual() - cantidad);
        System.out.println("Se han retirado " + cantidad + " de la cuenta.");
    }
public void extraccionRapida(CuentaBancaria cuenta, double cantidad){
    if (cantidad <= cuenta.getSaldoActual()*0.20){
      cuenta.setSaldoActual(cuenta.getSaldoActual()-cantidad);
    System.out.println("Se hizo una extraccion rapida de : " + cantidad + " de la cuenta");
    }else{
        System.out.println("El monto supera el limite permitido");
        }
    
}

   }