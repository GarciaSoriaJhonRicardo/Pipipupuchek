/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemaArchivo;

public class SistemaArchivos {
    private Carpeta raiz;
    private Carpeta carpetaActual;

    public SistemaArchivos() {
        raiz = new Carpeta("raiz", null);
        carpetaActual = raiz;
    }

    public void crearCarpeta(String nombre) {
        Carpeta nueva = new Carpeta(nombre, carpetaActual);
        if (carpetaActual.agregarElemento(nueva)) {
            System.out.println("Carpeta creada: " + nombre);
        } else {
            System.out.println("No se puede crear más de 5 elementos en esta carpeta.");
        }
    }

    public void crearArchivo(String nombre, int tamano) {
        Archivo nuevo = new Archivo(nombre, tamano);
        if (carpetaActual.agregarElemento(nuevo)) {
            System.out.println("Archivo creado: " + nombre);
        } else {
            System.out.println("No se puede crear más de 5 elementos en esta carpeta.");
        }
    }

    public void entrar(String nombreCarpeta) {
        for (Object elemento : carpetaActual.getElementos()) {
            if (elemento instanceof Carpeta) {
                Carpeta carpeta = (Carpeta) elemento;
                if (carpeta.getNombre().equals(nombreCarpeta)) {
                    carpetaActual = carpeta;
                    System.out.println("Ingresaste a la carpeta: " + nombreCarpeta);
                    return;
                }
            }
        }
        System.out.println("La carpeta no existe.");
    }

    public void subir() {
        if (carpetaActual.getCarpetaPadre() != null) {
            carpetaActual = carpetaActual.getCarpetaPadre();
            System.out.println("Subiste al nivel superior.");
        } else {
            System.out.println("Ya estás en la carpeta raíz.");
        }
    }

    public void verRuta() {
        String ruta = "";
        Carpeta temp = carpetaActual;
        while (temp != null) {
            ruta = "/" + temp.getNombre() + ruta;
            temp = temp.getCarpetaPadre();
        }
        System.out.println("Ruta actual: " + ruta);
    }
}
