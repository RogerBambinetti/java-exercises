
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
public class Ex_06 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Informe o número de linhas: ");
        int linhas = s.nextInt();
        System.out.println("Informe o número de colunas: ");
        int colunas = s.nextInt();
        int matriz[][] = new int[linhas][colunas];
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.println("Informe o valor para a posição " + i + " " + j);
                matriz[i][j] = s.nextInt();
            }
        }
        procedimento(matriz, linhas, colunas);
        System.out.println("Soma da diagonal principal: " + procedimento(matriz, linhas, colunas));
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print(matriz[i][j] + " ");

            }
            System.out.println(" ");
        }
    }

    public static int procedimento(int[][] matriz, int linhas, int colunas) {
        int somador = 0;
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                if (i == j) {
                    somador = somador + matriz[i][j];
                }

            }

        }
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                if (i < j) {
                    int aux = matriz[i][j];
                    matriz[i][j] = matriz[j][i];
                    matriz[j][i] = aux;
                }

            }
        }
        return somador;
    }

}
