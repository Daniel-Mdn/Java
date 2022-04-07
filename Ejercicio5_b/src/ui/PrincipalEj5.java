package ui;

import java.util.ArrayList;
import java.util.Scanner;

import entidades.Administrativo;
import entidades.Empleado;
import entidades.Vendedor;

public class PrincipalEj5 {

 public static void main(String[] args) {
  Empleado empleado;
  
  ArrayList<Empleado> listaEmpleados= new ArrayList<Empleado>();
  
  Scanner lector= new Scanner(System.in);
  System.out.println("Cuantos empleados desea ingresar?");
  int length=Integer.parseInt(lector.nextLine());
  
  for (int i = 0; i < length; i++) {
   System.out.println("Dni del empleado:");
   int dni=Integer.parseInt(lector.nextLine());
   System.out.println("Nombre del empleado:");
   String nombre=lector.nextLine();
   System.out.println("Apellido del empleado:");
   String apellido=lector.nextLine();
   System.out.println("Mail del empleado:");
   String mail=lector.nextLine();
   System.out.println("Sueldo base del empleado:");
   int sueldoBase=Integer.parseInt(lector.nextLine());
   System.out.println("El empleado es administrativo o vendedor?(a/v)");
   
   if (lector.nextLine().equals("v")) {
	System.out.println("Porcentaje de comision del vendedor (0 a 100):");
	double porcenComision= Float.parseFloat(lector.nextLine());
	porcenComision= (porcenComision)/100.0;
    System.out.println("Total de ventas del vendedor:");
    int totalVentas= Integer.parseInt(lector.nextLine());
    empleado=new Vendedor(dni, nombre, apellido, mail, sueldoBase, porcenComision, totalVentas);
    listaEmpleados.add(empleado);
   }else {
    System.out.println("Horas extras del vendedor:");
    int hsExtras= Integer.parseInt(lector.nextLine());
    System.out.println("Horas del mes de vendedor:");
    int hsMes= Integer.parseInt(lector.nextLine());
    empleado=new Administrativo(dni, nombre, apellido, mail, sueldoBase, hsExtras, hsMes);
    listaEmpleados.add(empleado);
   }
   
  }
  
  System.out.println(listaEmpleados.get(0));
  for (int i = 0; i < listaEmpleados.size(); i++) {
	  System.out.println(listaEmpleados.get(i).getNombre());
	  System.out.println(listaEmpleados.get(i).getApellido());
	  System.out.println(listaEmpleados.get(i).getSueldo());
  }
  lector.close();
 }

}