/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package muk;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Muk {
    public static void main(String[] args) {
        Scanner lotus = new Scanner(System.in);

        String correoRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        String claveCorrecta = "P@55w0rd";
        int intentos = 0;
        final int MAX_INTENTOS = 5;

        while (intentos < MAX_INTENTOS) {
            System.out.print("Ingrese su correo electrónico: ");
            String correo = lotus.nextLine();

            System.out.print("Ingrese su clave de acceso: ");
            String clave = lotus.nextLine();

            Pattern pattern = Pattern.compile(correoRegex);
            Matcher matcher = pattern.matcher(correo);

            if (matcher.matches() && clave.equals(claveCorrecta)) {
                System.out.println("Bienvenido al sistema");
                break;
            } else {
                System.out.println("Acceso denegado");
                intentos++;
            }

            if (intentos == MAX_INTENTOS) {
                System.out.println("Cuenta suspendida");
            }
        }
    }
}