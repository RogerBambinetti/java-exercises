
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ROGER
 */
public class NewClass1 {

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Informe o valor 1: ");
            int val = s.nextInt();
            System.out.println("Informe o valor 2: ");
            int val2 = s.nextInt();
            for (int j = val; j < val2; j++) {
                if (j % 2 == 0) {
                      System.out.println(j);
                }

            }

        }

    }

}
