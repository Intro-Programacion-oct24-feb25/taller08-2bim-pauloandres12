/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problemas;

/**
 *
 * @author reroes
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1;
        int num2;
        int num3;
        
        for (int i = 30; i >= 10; i--) {
            num1 = i + i;
            num2 = num1 + i;
            num3 = num2 + i;
            System.out.printf("%s-%s-%s-%s\n",
                    i,
                    num1,
                    num2,
                    num3);
        }
    
    }
    
}
