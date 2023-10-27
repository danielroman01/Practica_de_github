 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menuautos;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author Daniel
 */
public class Principal {

    public static void main(String[] args) throws Exception {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<MenuAutos> autos = new ArrayList<MenuAutos>();

        int limite = 0;

        while (limite == 0) {
            System.out.println("-----Menú de usuario-----");
            System.out.println("1. Crear auto.");
            System.out.println("2. Modificar auto.");
            System.out.println("3. Eliminar auto.");
            System.out.println("4. Búscar auto.");
            System.out.println("5. Móstrar todos los autos.");
            System.out.println("6. Salir.");
            System.out.println("------------------------------");
            System.out.print("Pórfavor ingrese una opción: ");
            int opcion = Integer.parseInt(bf.readLine());

            switch (opcion) {
                case 1:
                    System.out.println("-----Creando un auto-----");
                    System.out.print("Ingrese patente: ");
                    String patente = bf.readLine();
                    
                    System.out.print("Ingrese marca: ");
                    String marca = bf.readLine();
                    
                    System.out.print("Ingrese color: ");
                    String color = bf.readLine();
              
                    System.out.print("Ingrese año: ");
                    int año = Integer.parseInt(bf.readLine());
                    
                    System.out.print("Ingrese modelo: ");
                    String modelo = bf.readLine();
                    
                    MenuAutos al = new MenuAutos(patente, marca, color, año, modelo);
                    System.out.println("Auto creado...");       
                    autos.add(al);
                    
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    System.out.print("Ingrese patente a búscar: ");
                    String p = bf.readLine();
                    
                    int encontrado = 0;
                    
                    for (int i = 0; i < autos.size(); i++) {
                        if (p.equals(autos.get(i).getPatente())) {
                            System.out.println("¡Auto encontrado!");
                            System.out.println("Marca: " + autos.get(i).getMarca());
                            System.out.println("color: " + autos.get(i).getColor());
                            System.out.println("año: " + autos.get(i).getAño());
                            System.out.println("Modelo: " + autos.get(i).getModelo());
                            encontrado = 1;
                        }
                    }
                    
                    if (encontrado == 0) {
                        System.out.println("¡Oh no!, auto no encontrado.");
                    }
                    
                    break;
                case 5:
                    for (int i = 0; i < autos.size(); i++) {
                        System.out.println("Patente: " + autos.get(i).getPatente());
                    }
                    break;
                case 6:
                    System.out.println("Gracias, hasta prónto. ");
                    limite = 999;
                    break;
                default:
                    System.out.println("Opción no válida");
            } /// Fin Switch

        } /// Fin While

    } /// Fin Main
} /// Fin Clase
