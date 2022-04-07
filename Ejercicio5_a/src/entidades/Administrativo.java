package entidades;

public class Administrativo extends Empleado {
 private int hsExtra;
 private int hsMes;
 
 public Administrativo(int dni, String nombre, String apellido, String mail, int sueldoBase, int hsExtras, int hsMes) {
  super(dni, nombre, apellido, mail, sueldoBase);
  this.hsExtra=hsExtras;
  this.hsMes=hsMes;
 }

 public double getSueldo(){
  return super.getSueldo()*((this.hsExtra * 1.5)+this.hsMes) / this.hsMes;
 }

 
}