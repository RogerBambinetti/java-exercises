
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

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int vetor1[] = new int[5];
        int vetor2[] = new int[5];
        for (int i = 0; i < vetor1.length; i++) {
            System.out.println("Informe o valor " + i);
            vetor1[i] = s.nextInt();
        }
        for (int i = 0; i < vetor2.length; i++) {
            System.out.println("Informe o valor " + i);
            vetor2[i] = s.nextInt();
        }
        comparar(vetor1, vetor2);
        System.out.println("Número de elementos em comum "+ comparar(vetor1, vetor2));
    }

    public static int comparar(int[] vetor1, int[] vetor2) {
        int cont = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (vetor1[i] == vetor2[j]) {
                    cont++;
                }
            }
        }
        return cont;
    }
}
