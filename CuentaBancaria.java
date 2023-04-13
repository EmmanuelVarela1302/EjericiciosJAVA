
package Entidad;

import java.util.Scanner;


public class CuentaBancaria {
   Scanner leer = new Scanner (System.in);
    private int numeroCuenta;
    private long numeroDni;
    private double saldoActual;

    public CuentaBancaria() {
    }

    public CuentaBancaria(double saldoActual) {
        this.saldoActual = saldoActual;
    }
    

    public CuentaBancaria(int numeroCuenta, long numeroDni, double saldoActual) {
        this.numeroCuenta = numeroCuenta;
        this.numeroDni = numeroDni;
        this.saldoActual = saldoActual;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public long getNumeroDni() {
        return numeroDni;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setNumeroDni(long numeroDni) {
        this.numeroDni = numeroDni;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" + "numeroCuenta=" + numeroCuenta + ", numeroDni=" + numeroDni + ", saldoActual=" + saldoActual + '}';
    }
 
       
   }
    


