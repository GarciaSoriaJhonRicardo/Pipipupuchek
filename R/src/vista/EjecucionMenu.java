/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import controlador.AdministradorPublicaciones;
import modelo.Publicacion;

import java.util.Scanner;

public class EjecucionMenu {

    public static void mostrarMenu() {
        System.out.println("====== Menú de Publicaciones ======");
        System.out.println("1. Agregar Publicación");
        System.out.println("2. Mostrar Publicaciones");
        System.out.println("3. Salir");
        System.out.print("Seleccione una opción: ");
    }

    public static void ejecutarOpcion() {
        Scanner sc = new Scanner(System.in);
        AdministradorPublicaciones admin = new AdministradorPublicaciones();
        int opcion;

        do {
            mostrarMenu();
            opcion = sc.nextInt();
            sc.nextLine(); 

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese Titulo: ");
                    String titulo = sc.nextLine();
                    System.out.println("Ingrese Contenido: ");
                    String contenido = sc.nextLine();
                    System.out.println("Ingrese Autor1: ");
                    String autor1 = sc.nextLine();
                    System.out.println("Ingrese Autor2: ");
                    String autor2 = sc.nextLine();
                    System.out.println("Ingrese Autor3: ");
                    String autor3 = sc.nextLine();
                    System.out.println("Ingrese Revista: ");
                    String revista = sc.nextLine();
                    System.out.println("Ingrese Fecha de Publicación: ");
                    String fecha = sc.nextLine();
                    System.out.println("Ingrese Filiación: ");
                    String filiacion = sc.nextLine();

                    Publicacion pub = new Publicacion(titulo, contenido, autor1, autor2, autor3, revista, fecha, filiacion);
                    admin.agregarPublicacion(pub);
                    System.out.println("Publicación agregada exitosamente.\n");
                    break;
                case 2:
                    admin.imprimir();
                    break;
                case 3:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.\n");
            }
        } while (opcion != 3);
    }

    public static void main(String[] args) {
        ejecutarOpcion();
    }
}
