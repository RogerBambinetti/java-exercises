
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
        System.out.println("Informe o ângulo a: ");
        int a = s.nextInt();
        System.out.println("Informe o ângulo b: ");
        int b = s.nextInt();
        System.out.println("Informe o ângulo c: ");
        int c = s.nextInt();
        String resultado = tipo(a, b, c);
        System.out.println("O Triângulo é " + resultado);

    }

    public static String tipo(int a, int b, int c) {
        if (a == 90 || b == 90 || c == 90) {
            return "Retângulo";

        } else if (a > 90 || b > 90 || c > 90) {
            return "Obtusângulo";
        } else {
            return "Acutângulo";
        }
    }

}
