
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
public class Exercicio {

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int somapar = 0;
        int contpar = 0;
        int somaimpar = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println("Informe um número: ");
            int num = s.nextInt();
            if (num % 2 == 0) {
                somapar = somapar + num;
                contpar = contpar + 1;

            } else {
                somaimpar = somaimpar + num;

            }
        }
        double mediapares = somapar / contpar;
        System.out.println("A soma de todos os valor ímpares: " + somaimpar);
        System.out.println("A média dos valores pares é: " + mediapares);
    }
}
