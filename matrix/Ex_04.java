
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author aluno
 */
public class NovoClass {

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int numeros[][] = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println("Informe o valor na posição " + i + " " + j);
                numeros[i][j] = s.nextInt();

            }
        }
        System.out.println("Informe o valor à ser verificado: ");
        int valor = s.nextInt();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (numeros[i][j]==valor){
                    System.out.println("O valor existe na matriz!");
                }
            }
        }

    }

}
