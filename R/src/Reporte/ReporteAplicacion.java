/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reporte;

import java.util.Scanner;

public class ReporteAplicacion {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de estudiantes: ");
        int n = sc.nextInt();
        sc.nextLine();

        EstudianteUniv[] estudiantes = new EstudianteUniv[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\n--- Estudiante " + (i + 1) + " ---");
            System.out.print("Ingrese código: ");
            String codigo = sc.nextLine();
            System.out.print("Ingrese nombre: ");
            String nombre = sc.nextLine();

            EstudianteUniv est = new EstudianteUniv(codigo, nombre);

            System.out.print("Ingrese calificación 1: ");
            double cal1 = sc.nextDouble();
            System.out.print("Ingrese calificación 2: ");
            double cal2 = sc.nextDouble();
            System.out.print("Ingrese calificación 3: ");
            double cal3 = sc.nextDouble();
            System.out.print("Ingrese calificación 4: ");
            double cal4 = sc.nextDouble();
            sc.nextLine();

            est.registrarCalificaciones(cal1, cal2, cal3, cal4);
            estudiantes[i] = est;
        }

        System.out.println("\n=== Reporte de Estudiantes ===");
        for (int i = 0; i < estudiantes.length; i++) {
            System.out.println("\nEstudiante " + (i + 1) + ":");
            estudiantes[i].mostrarDatos();
        }

        ReporteCalificaciones reporte = new ReporteCalificaciones();
        double promedioGeneral = reporte.promedioGeneral(estudiantes);
        System.out.println("\nPromedio General de todos los estudiantes: " + promedioGeneral);
    }
}

