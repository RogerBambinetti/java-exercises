
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
public class Ex_02 {

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Informe os anos: ");
        int a = s.nextInt();
        System.out.println("Informe os meses: ");
        int b = s.nextInt();
        System.out.println("Informe os dias: ");
        int c = s.nextInt();
        int resultado = idade(a, b, c);
        System.out.println("A idade expressa em dias é " + resultado);

    }

    static int idade(int a, int b, int c) {
        a = a * 365;
        b = b * 30;
        return a + b + c;

    }
}
