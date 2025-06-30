/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reporte;

public class ReporteCalificaciones {

    public double promedioGeneral(EstudianteUniv[] estudiantes) {
        double suma = 0;
        for (int i = 0; i < estudiantes.length; i++) {
            suma += estudiantes[i].getPromedio();
        }
        return suma / estudiantes.length;
    }
}
