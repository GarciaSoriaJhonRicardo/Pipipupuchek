/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelo.Publicacion;

public class AdministradorPublicaciones {
    private final int FACTOR_CAPACIDAD = 10;
    private int contadorPublicaciones;
    private Publicacion[] publicaciones;

    public AdministradorPublicaciones() {
        publicaciones = new Publicacion[FACTOR_CAPACIDAD];
        contadorPublicaciones = 0;
    }

    public void agregarPublicacion(Publicacion publicacion) {
        if (contadorPublicaciones == publicaciones.length) {
            
            Publicacion[] nuevoArreglo = new Publicacion[publicaciones.length + FACTOR_CAPACIDAD];
            System.arraycopy(publicaciones, 0, nuevoArreglo, 0, publicaciones.length);
            publicaciones = nuevoArreglo;
        }
        publicaciones[contadorPublicaciones++] = publicacion;
    }

    public Publicacion[] getPublicaciones() {
        Publicacion[] resultado = new Publicacion[contadorPublicaciones];
        System.arraycopy(publicaciones, 0, resultado, 0, contadorPublicaciones);
        return resultado;
    }

    public void imprimir() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%-20s %-20s %-20s %-20s %-20s %-20s %-20s %-20s\n",
                "Titulo", "Contenido", "Autor1", "Autor2", "Autor3", "Revista", "FechaPub", "Filiacion"));
        sb.append("---------------------------------------------------------------------------------------------------------------\n");

        for (int i = 0; i < contadorPublicaciones; i++) {
            sb.append(publicaciones[i].toString());
        }
        System.out.println(sb.toString());
    }
}
