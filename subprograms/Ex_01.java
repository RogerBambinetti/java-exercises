
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
        System.out.println("Informe o número de maçãs: ");
        int a = s.nextInt();
        double b = 0;
        if (a < 12) {
            b = 0.30;
        } else {
            b = 0.25;
        }
        double resultado = preco(a, b);
        System.out.println("O preço final é R$: " + resultado);

    }

    static double preco(int a, double b) {
        return a * b;
    }
}
