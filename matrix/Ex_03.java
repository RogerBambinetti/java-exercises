
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
        int somador = 0;
        int cont = 0;
        System.out.println("Informe o número de linhas: ");
        int linhas = s.nextInt();
        System.out.println("Informe o número de colunas: ");
        int colunas = s.nextInt();
        int numeros[][] = new int[linhas][colunas];
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.println("Informe o valor na posição " + i + " " + j);
                numeros[i][j] = s.nextInt();
            }
        }
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                if (i % 2 == 0) {
                    somador = somador + numeros[i][j];
                }
            }
        }
        System.out.println(somador);
    }
}
