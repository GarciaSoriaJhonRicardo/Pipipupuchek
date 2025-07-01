/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemaArchivo;

public class ControladorPrincipal {
    public static void main(String[] args) {
        SistemaArchivos sistema = new SistemaArchivos();

        sistema.verRuta();
        sistema.crearCarpeta("Documentos");
        sistema.crearArchivo("imagen.jpg", 500);
        sistema.crearCarpeta("Fotos");

        sistema.entrar("Documentos");
        sistema.verRuta();
        sistema.crearArchivo("tarea.docx", 300);

        sistema.subir();
        sistema.verRuta();
    }
}
