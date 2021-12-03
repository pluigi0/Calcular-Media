package CalcularMedia;

import javax.swing.JOptionPane;

/*
Pedir numeros hasta que se introduzca
uno negativo, y calcular la media.
 */
public class CalcularMedia {
    public static void main(String[] args) {
        int numero, contador=0, media, acumulador=0;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Mete un numero"));
        
        while(numero >= 0){
            
            acumulador += numero;
            
            contador += 1;
            
            media = acumulador / contador;
            
            JOptionPane.showMessageDialog(null, " La suma de los numeros "
                    + "introducidos: "+acumulador + " \nLa media de "
                    + "los numeros introducidos es: "+media);
            
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un otro numero:"));

        }

            JOptionPane.showMessageDialog(null, " Error! Introduciste "+numero+ " es un negativo");

        
    }
}
