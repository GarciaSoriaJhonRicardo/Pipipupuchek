/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estacionamiento;

public class ControladorPrincipal {
    public static void main(String[] args) {
        Estacionamiento estacionamiento = new Estacionamiento();

        Auto auto1 = new Auto("ABC123", "Toyota", "Corolla", "Juan Perez");
        Auto auto2 = new Auto("XYZ789", "Nissan", "Sentra", "Maria Lopez");
        Auto auto3 = new Auto("QWE456", "Chevrolet", "Spark", "Carlos Ruiz");

        estacionamiento.parquear(1, auto1);
        estacionamiento.parquear(1, auto2);
        estacionamiento.parquear(2, auto3);

        estacionamiento.mostrarUbicaciones(1);
        estacionamiento.mostrarUbicaciones(2);

        estacionamiento.retirar(1, "ABC123");
        estacionamiento.mostrarUbicaciones(1);
    }
}
