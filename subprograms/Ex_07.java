
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ROGER
 */
public class Ex_07 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int vetor[] = new int[18];
        int matriz[][] = new int[6][3];
        for (int i = 0; i < 18; i++) {
            System.out.println("Informe o valor " + i);
            vetor[i] = s.nextInt();
        }
        metodo(vetor, matriz);
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");

            }
            System.out.println(" ");
        }

    }

    public static void metodo(int[] vetor, int[][] matriz) {
        int cont = 0;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = vetor[cont];
                cont++;

            }

        }

    }

}
