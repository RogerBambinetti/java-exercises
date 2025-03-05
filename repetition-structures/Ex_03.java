
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
public class Ex_03 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Informe um valor: ");
        int val = s.nextInt();
        int result = val;
        for (int i = val; i > 2; i--) {
            result = result * (i - 1);
            System.out.println(result);
        }
        

    }

}
