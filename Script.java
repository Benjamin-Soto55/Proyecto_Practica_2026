/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package script;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Script {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese el año de nacimiento:");
        int anio = teclado.nextInt();

        System.out.println("Ingrese el mes de nacimiento:");
        int mes = teclado.nextInt();

        System.out.println("Ingrese el día de nacimiento:");
        int dia = teclado.nextInt();

        LocalDate fechaNacimiento = LocalDate.of(anio, mes, dia);
        LocalDate fechaActual = LocalDate.now();

        Period edad = Period.between(fechaNacimiento, fechaActual);

        System.out.println("La edad es: " + edad.getYears() + " años");

        teclado.close();
    }
}
