package entidades;

public class Empleado {
 private int dni;
 private String nombre;
 private String apellido;
 private String mail;
 private int sueldoBase;
 
 public Empleado(int dni, String nombre, String apellido, String mail, int sueldoBase) {
  this.dni= dni;
  this.apellido=apellido;
  this.nombre=nombre;
  this.mail=mail;
  this.sueldoBase=sueldoBase;
 }
 
  public String getNombre() {
   return this.nombre;
  }
  
  public String getApellido() {
	   return this.apellido;
  }

  
  public double getSueldo() {
	  return this.sueldoBase;
  }
  
  
}