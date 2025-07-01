/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estacionamiento;

public class Zona {
    private Auto[] autos;
    private String nombreZona;

    public Zona(String nombreZona) {
        this.nombreZona = nombreZona;
        this.autos = new Auto[7]; // 7 espacios por zona
    }

    public String getNombreZona() {
        return nombreZona;
    }

    public Auto[] getAutos() {
        return autos;
    }

    public boolean parquearAuto(Auto auto) {
        for (int i = 0; i < autos.length; i++) {
            if (autos[i] == null) {
                autos[i] = auto;
                return true;
            }
        }
        return false; // zona llena
    }

    public boolean retirarAuto(String placa) {
        for (int i = 0; i < autos.length; i++) {
            if (autos[i] != null && autos[i].getPlaca().equals(placa)) {
                autos[i] = null;
                return true;
            }
        }
        return false; // auto no encontrado
    }

    public void mostrarUbicaciones() {
        System.out.println("Ubicaciones en la zona: " + nombreZona);
        for (int i = 0; i < autos.length; i++) {
            if (autos[i] == null) {
                System.out.println("Lugar " + (i + 1) + ": Libre");
            } else {
                System.out.println("Lugar " + (i + 1) + ": " + autos[i].getPlaca() + " - " + autos[i].getPropietario());
            }
        }
    }
}
