
import static java.time.Clock.system;
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
public class Exercício {

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        char continuar;
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        do {
            System.out.println("Informe um valor: ");
            int val = s.nextInt();
            if (val > maior) {
                maior = val;
            }
            if (val < menor) {
                menor = val;
            }
            System.out.println("Continuar? s/n");
            continuar = s.next().charAt(0);
        }while (continuar == 's');
        System.out.println("Maior valor: " + maior);
        System.out.println("Menor valor: " + menor);
        
    }
    
}
