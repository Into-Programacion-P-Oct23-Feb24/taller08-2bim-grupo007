/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author LAB.ELECT
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String nombre;
        String posicion;
        int edad;
        double estatura;
        double sumaEdades = 0;
        double promedioEdades;
        double sumaEstatura = 0;
        double promedioEstatura;
        int numero;
        String acumulador = "\nListado de Jugadores\n";
        String edadesJuntas = "Listado de Edades";

        System.out.println("Ingrese el numero de veces que desea "
                + "ingresar datos");
        numero = entrada.nextInt();
        
        
        for (int contador = 1; contador <= numero; contador++) {
            entrada.nextLine();
            System.out.println("Ingrese el nombre del jugador");
            nombre = entrada.nextLine();
            System.out.println("Ingrese la posicion en el campo de juego");
            posicion = entrada.nextLine();
            System.out.println("Ingrese la edad del jugador");
            edad = entrada.nextInt();
            System.out.println("Ingrese la estatura del jugador");
            estatura = entrada.nextDouble();
            
            
            sumaEdades = sumaEdades + edad;
            sumaEstatura = (sumaEstatura + estatura);
            
            acumulador = String.format("%s%d. %s -%s-, edad %d"
                    + ", estatura %.2f\n", acumulador, contador
                    , nombre, posicion, edad,estatura);
            
           edadesJuntas = String.format("%s %d",edadesJuntas,edad);
        }
        promedioEdades = sumaEdades / numero;
        promedioEstatura = sumaEstatura / numero;
        
        System.out.printf("%s",acumulador);
        System.out.printf("%s",edadesJuntas);
        System.out.printf("\nPromedio de edades: %.1f",promedioEdades);
        System.out.printf(" Promedio de estaturas: %.2f\n", promedioEstatura);
    }

}
