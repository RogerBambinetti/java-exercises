
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
public class Ex_06 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Informe x: ");
        int x = s.nextInt();
        System.out.println("Informe y: ");
        int y = s.nextInt();
        int result = x;
        for (int i = y; i > 1; i--) {
            result = result * x;
            System.out.println(result);
        }
    }

}
