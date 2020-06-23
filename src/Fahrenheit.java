/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lucca
 */
public class Fahrenheit {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        float c ;
        float f;
        
        c = 10;
        
        while (c <= 100) {
        
        f = (9 * c + 160) / 5;
        
        System.out.printf("%.2f°C = %.2f°F.\n", c, f);
        
        c += 10;
        
        }
        // TODO code application logic here
    }
    
}
