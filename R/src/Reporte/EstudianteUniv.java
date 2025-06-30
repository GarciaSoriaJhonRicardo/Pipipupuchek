/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reporte;

public class EstudianteUniv {

    private String codigo;
    private String nombre;
    private double cal1, cal2, cal3, cal4;
    private double promedio;

    public EstudianteUniv(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public void registrarCalificaciones(double cal1, double cal2, double cal3, double cal4) {
        this.cal1 = cal1;
        this.cal2 = cal2;
        this.cal3 = cal3;
        this.cal4 = cal4;
        calcularPromedio();
    }

    private void calcularPromedio() {
        this.promedio = (0.10 * cal1) + (0.20 * cal2) + (0.30 * cal3) + (0.40 * cal4);
    }

    public void mostrarDatos() {
        System.out.println("Código: " + codigo);
        System.out.println("Nombre: " + nombre);
        System.out.println("Calificación 1: " + cal1);
        System.out.println("Calificación 2: " + cal2);
        System.out.println("Calificación 3: " + cal3);
        System.out.println("Calificación 4: " + cal4);
        System.out.println("Promedio: " + promedio);
    }

    public double getPromedio() {
        return promedio;
    }
}
