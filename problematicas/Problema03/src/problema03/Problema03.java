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
          double gradosC = 1;
        double gradosF = 20;
        String tabla = "       Tabla De converciones\nGrados Fahrenheit  |  "
                + "Grados Celsius\n";
        int i;
        int e = 20;
        for (i = 1; i <= 20; i++) {
            gradosC = (e - 32.0) * 5 / 9;
            tabla = String.format("%s      %s                "
                    + "%.2f\n", tabla, e, gradosC);
            e += 4;
        }
        System.out.print(tabla);
    }
}
