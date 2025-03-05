
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
public class Ex_11 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int valor[] = new int[15];
        for (int i = 0; i < 15; i++) {
            int cont=0;
            do {
               cont=0;
                System.out.println("Informe o valor " + i);
                valor[i] = s.nextInt();
                if (valor[i] > 10) {
                    System.out.println("Valor inválido!");

                }
                
                for (int j = 0; j < 10; j++) {
                    if (valor[i] == valor[j]) {
                        cont++;
                    }
                   

                }
                if (cont>1){
                    System.out.println("Valor já informado!");
                }
            } while (valor[i] > 10 || cont > 1);
            fatorial(valor, i);
            System.out.println("O fatorial é: " + fatorial(valor, i));
        }

    }

    public static int fatorial(int[] valor, int i) {
        int resultado = 1;
        for (int j = valor[i]; j > 0; j--) {
            resultado = resultado * j;

        }
        return resultado;

    }
}
