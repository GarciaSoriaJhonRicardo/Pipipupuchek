/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemaArchivo;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Carpeta {
    private String nombre;
    private LocalDateTime fechaHoraCreacion;
    private ArrayList<Object> elementos;  // Puede contener Archivos o Carpetas
    private Carpeta carpetaPadre;

    public Carpeta(String nombre, Carpeta carpetaPadre) {
        this.nombre = nombre;
        this.carpetaPadre = carpetaPadre;
        this.fechaHoraCreacion = LocalDateTime.now();
        this.elementos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDateTime getFechaHoraCreacion() {
        return fechaHoraCreacion;
    }

    public ArrayList<Object> getElementos() {
        return elementos;
    }

    public Carpeta getCarpetaPadre() {
        return carpetaPadre;
    }

    public boolean agregarElemento(Object elemento) {
        if (elementos.size() < 5) {
            elementos.add(elemento);
            return true;
        } else {
            return false;
        }
    }
}
