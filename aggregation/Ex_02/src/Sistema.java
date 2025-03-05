
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author rogerbambinetti
 */
public class Sistema {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        List<Revendedora> revendedoras = new ArrayList<>();
        List<Fabricante> fabricantes = new ArrayList<>();
        int opcao = 0;

        do {
            System.out.println("+-------------------------------------- +\n"
                    + "|1. Cadastrar revendedora               |\n"
                    + "|2. Cadastrar fabricante                |\n"
                    + "|3. Cadastrar automóveis                |\n"
                    + "|4. Editar revendedora                  |\n"
                    + "|5. Excluir revendedora                 |\n"
                    + "|6. Excluir atomóvel                    |\n"
                    + "|7. Listar revendedoras                 |\n"
                    + "|8. Listar revendedoras e seus veículos |\n"
                    + "+---------------------------------------+");
            opcao = s.nextInt();
            switch (opcao) {
                case 1: {
                    System.out.println("Código filiação: ");
                    int codigoFiliacao = s.nextInt();
                    System.out.println("Nome fantasia: ");
                    String nomeFantasia = s.next();
                    System.out.println("Telefone: ");
                    String telefone = s.next();
                    System.out.println("Endereço: ");
                    String endereco = s.next();
                    Revendedora r = new Revendedora(codigoFiliacao, nomeFantasia, telefone, endereco);
                    revendedoras.add(r);
                }
                case 2: {
                    System.out.println("Nome: ");
                    String nome = s.next();
                    System.out.println("País: ");
                    String país = s.next();
                    Fabricante f = new Fabricante(nome, país);
                    fabricantes.add(f);

                }
                case 3: {
                    System.out.println("");
                }
            }

        } while (opcao
                != 0);
    }
}
