
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
public class Sistema {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        DaoConta daocon = new DaoConta();
        DaoCliente daocli = new DaoCliente();

        System.out.println("Manu:"
                + "1. Cadastrar"
                + "2. Excluir"
                + "3. Depositar"
                + "4. Sacar"
                + "5. Listar"
                + "6. Sair");
        int opcao = s.nextInt();
    }
}
