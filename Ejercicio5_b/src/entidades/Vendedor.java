package entidades;

public class Vendedor extends Empleado {
 private double  porcenComision;
 private int totalVentas;
 
 public Vendedor(int dni, String nombre, String apellido, String mail, int sueldoBase, double porcenComision2, int totalVentas){
  super( dni,  nombre, apellido, mail, sueldoBase);
  this.porcenComision=porcenComision2;
  this.totalVentas=totalVentas;
 }
 
 public double getSueldo(){
  return super.getSueldo() + (this.porcenComision*this.totalVentas/100);
 }
}
