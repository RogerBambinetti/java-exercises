
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
public class Ex_05 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Informe o tamanho do vetor: ");
        int tamanho = s.nextInt();
        int vetor[] = new int[tamanho];
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Informe o número da posição " + i + " :");
            vetor[i] = s.nextInt();
        }
        int resultado = negativos(vetor);
        System.out.println("Negativos: " + resultado);
         for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i]);
            System.out.print(" ");
        }
    }

    public static int negativos(int[] vetor) {
        int cont = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] < 0) {
                cont++;
                vetor[i] = 0;
            }
        }
        return cont;

    }

}
