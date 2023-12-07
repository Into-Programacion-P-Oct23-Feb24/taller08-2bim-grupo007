/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema03;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author LAB.ELECT
 */
public class Problema03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        //c = 5\9(f-32)
        double f = 0, c = 0;
        double operacion;
        String mensajeFinal = "";
        for (int i = 1; i <= 20; i++) {
            System.out.println("Ingrese la cantidad de grados Celsius a "
                    + "convertur");
            c = entrada.nextDouble();
            mensajeFinal = String.format("%sTabala %d\n",
                    mensajeFinal); 
            for (double contador = 4; contador <= 20; contador++) {
                c = 5 / 9 * f - 32;
            }
            mensajeFinal = String.format("%s\n", mensajeFinal);
        }
            System.out.printf("%s\n", mensajeFinal);

    }
}
