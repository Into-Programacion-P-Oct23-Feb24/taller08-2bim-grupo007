/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema02;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author LAB.ELECT
 */
public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        String acumulador = "";
        int sumaNumero;

        for (int numero = 30; numero != 9; numero--) {
            sumaNumero = numero;
            for (int limite = 0; limite < 4; limite++) {
                if(limite==0){
                    acumulador = String.format("%s%d"
                        , acumulador,sumaNumero);
                }else{
                    if(limite == 3){
                        acumulador = String.format("%s-%d\n"
                        , acumulador,sumaNumero);
                    }else{
                         acumulador = String.format("%s-%d"
                        , acumulador,sumaNumero);
                    }       
                }
                sumaNumero = sumaNumero + numero; 
            }
            
        }
        System.out.printf("%s",acumulador);
    }
}
