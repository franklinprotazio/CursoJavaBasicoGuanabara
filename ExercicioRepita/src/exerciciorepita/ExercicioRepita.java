/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciorepita;

import javax.swing.JOptionPane;

/**
 *
 * @author Franklin
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*int num, soma = 0, cont = 0, numPar = 0, numImpar = 0, numAcimaDe100 = 0;
        do {
            num =  Integer.parseInt(JOptionPane.showInputDialog(null,
                "<html>Informe um numero: <br><em>(Valor 0 interrompe)</em></html>"));
            if(num >= 0 ){
                cont++;
            }
            if(num % 2 == 0){
                numPar++;
            } else {
                numImpar++;
            }
            if(num >= 100){
                numAcimaDe100++;
            }
            soma += num;
            
        } while (num != 0);
       JOptionPane.showMessageDialog(null, "<html>Resultado Final<br><hr>" +
               "<br>Total de Valores: " + (cont - 1) + "<br> Total de Par: " + (numPar - 1) + "<br> Total de Impares: " + numImpar +
               "<br>Acima de 100: " + numAcimaDe100  + "<br>Média dos valores: "+ (soma / cont )+ "<html>");*/
             int total = 0;
int c[] = new int[10];
for (int i = 0; i<c.length; i++) {
	c[i] = i + i;
}
for (int i = 0; i<c.length; i++) {
	total += c[i];
}
System.out.println(total);
      
    }
    
}
