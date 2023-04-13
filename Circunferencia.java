/*
Declarar una clase llamada Circunferencia que tenga como 
atributo privado el radio de tipo real. 
A continuación, se deben crear los siguientes métodos:
Método constructor que inicialice el radio pasado como parámetro.
Métodos get y set para el atributo radio de la clase Circunferencia.
Método para crearCircunferencia():
que le pide el radio y lo guarda  en el atributo del objeto.
Método area(): para calcular el área de la circunferencia (Area=〖π*radio〗^2).
Método perimetro(): para calcular el perímetro (Perimetro=2*π*radio).

 */
package Entidad;

//Clase circunferencia
public class Circunferencia {
    //Atributo privado del radio tipo real
    private double radio;
  
   
    //Constructor con parametros
    public Circunferencia (double radio){
        this.radio=radio;
    }
     //Metodo set
    public void setRadio(double radio){
      this.radio= radio;
    }
    //Metodo get
    public double getRadio (double radio){
        return radio;
    }
    //Metodo crearCircunferencia
    public double crearCircunferencia(double radio){
    return radio;
    }
    //Metodo area
    public double getArea (){
     
        double Area= radio * 3.14 *2;
        return Area;
    }
    //Metodo perimetro
    public double getPerimetro(){
        double Perimetro=  radio * 3.14 *2;
        return Perimetro;
    }
 
    

}
