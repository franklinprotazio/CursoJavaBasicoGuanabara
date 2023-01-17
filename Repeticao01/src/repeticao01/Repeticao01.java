/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repeticao01;

/**
 *
 * @author Franklin
 */
public class Repeticao01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*int cc = 0;
        do {
            System.out.println("Cambalhota");
            cc++;
        } while (cc <4 );*/
       int v0 = 3;
int v1 = v0++;
int v2 = ++v1;
v1 += v0;
v2 += --v1;
        System.out.println(v1 + v0 + v2 +v1);
    }
    
}
