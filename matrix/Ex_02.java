
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
public class NewClass {

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int cont= 0;
        System.out.println("Informe o número de linhas: ");
        int linhas = s.nextInt();
        System.out.println("Informe o número de colunas: ");
        int colunas = s.nextInt();
        int numeros[][] = new int[linhas][colunas];
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.println("Informe o valor da posição " + i + " " + j);
                numeros[i][j] = s.nextInt();
            }
        }

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                if (numeros[i][j] > 15 && numeros[i][j] < 20) {
                    cont++;
                }
            }
        }
        System.out.println("Quantidade de números entre 15 e 20: "+ cont);
    }
}
