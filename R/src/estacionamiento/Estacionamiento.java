/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estacionamiento;

public class Estacionamiento {
    private Zona[] zonas;

    public Estacionamiento() {
        zonas = new Zona[5];
        for (int i = 0; i < zonas.length; i++) {
            zonas[i] = new Zona("Zona " + (i + 1));
        }
    }

    public void parquear(int numeroZona, Auto auto) {
        if (numeroZona >= 1 && numeroZona <= 5) {
            boolean resultado = zonas[numeroZona - 1].parquearAuto(auto);
            if (resultado) {
                System.out.println("Auto parqueado en " + zonas[numeroZona - 1].getNombreZona());
            } else {
                System.out.println("La zona está llena.");
            }
        } else {
            System.out.println("Zona inválida.");
        }
    }

    public void retirar(int numeroZona, String placa) {
        if (numeroZona >= 1 && numeroZona <= 5) {
            boolean resultado = zonas[numeroZona - 1].retirarAuto(placa);
            if (resultado) {
                System.out.println("Auto retirado de " + zonas[numeroZona - 1].getNombreZona());
            } else {
                System.out.println("Auto no encontrado en la zona.");
            }
        } else {
            System.out.println("Zona inválida.");
        }
    }

    public void mostrarUbicaciones(int numeroZona) {
        if (numeroZona >= 1 && numeroZona <= 5) {
            zonas[numeroZona - 1].mostrarUbicaciones();
        } else {
            System.out.println("Zona inválida.");
        }
    }
}
