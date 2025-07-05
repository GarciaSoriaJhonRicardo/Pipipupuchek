/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

public class Publicacion {
    private String filiacion;
    private String fechaPublicacion;
    private String revista;
    private String autor3;
    private String autor2;
    private String autor1;
    private String contenido;
    private String titulo;

    public Publicacion(String titulo, String contenido, String autor1, String autor2, String autor3, String revista, String fechaPublicacion, String filiacion) {
        this.titulo = titulo;
        this.contenido = contenido;
        this.autor1 = autor1;
        this.autor2 = autor2;
        this.autor3 = autor3;
        this.revista = revista;
        this.fechaPublicacion = fechaPublicacion;
        this.filiacion = filiacion;
    }

    public String getFiliacion() { return filiacion; }
    public void setFiliacion(String filiacion) { this.filiacion = filiacion; }

    public String getFechaPublicacion() { return fechaPublicacion; }
    public void setFechaPublicacion(String fechaPublicacion) { this.fechaPublicacion = fechaPublicacion; }

    public String getRevista() { return revista; }
    public void setRevista(String revista) { this.revista = revista; }

    public String getAutor3() { return autor3; }
    public void setAutor3(String autor3) { this.autor3 = autor3; }

    public String getAutor2() { return autor2; }
    public void setAutor2(String autor2) { this.autor2 = autor2; }

    public String getAutor1() { return autor1; }
    public void setAutor1(String autor1) { this.autor1 = autor1; }

    public String getContenido() { return contenido; }
    public void setContenido(String contenido) { this.contenido = contenido; }

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    @Override
    public String toString() {
        return String.format("%-20s %-20s %-20s %-20s %-20s %-20s %-20s %-20s\n",
                titulo, contenido, autor1, autor2, autor3, revista, fechaPublicacion, filiacion);
    }
}
