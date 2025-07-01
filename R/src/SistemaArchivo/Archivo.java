/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemaArchivo;

import java.time.LocalDateTime;

public class Archivo {
    private String nombre;
    private LocalDateTime fechaHoraCreacion;
    private int tamano;

    public Archivo(String nombre, int tamano) {
        this.nombre = nombre;
        this.tamano = tamano;
        this.fechaHoraCreacion = LocalDateTime.now();
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDateTime getFechaHoraCreacion() {
        return fechaHoraCreacion;
    }

    public int getTamano() {
        return tamano;
    }
}
