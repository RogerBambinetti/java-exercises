
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
        int opcao = 0;
        List<Professor> professores = new ArrayList<>();
        List<Turma> turmas = new ArrayList<>();
        do {
            System.out.println("|1. Cadastrar professor \n"
                    + "|2. Cadastrar turma \n"
                    + "|3. Listar turmas       \n");
            opcao = s.nextInt();
            switch (opcao) {
                case 1: {
                    System.out.println("Matrícula:");
                    int matricula = s.nextInt();
                    System.out.println("Nome:");
                    String nome = s.next();
                    System.out.println("Cpf:");
                    String cpf = s.next();
                    System.out.println("Data Nascimento:");
                    String dataNascimento = s.next();
                    System.out.println("Formação:");
                    String formacao = s.next();
                    Professor p = new Professor(matricula, nome, cpf, dataNascimento, formacao);
                    professores.add(p);

                    break;
                }
                case 2: {
                    System.out.println("Código:");
                    int codigo = s.nextInt();
                    System.out.println("Curso:");
                    String curso = s.next();
                    System.out.println("Ano Ingresso:");
                    int anoIngresso = s.nextInt();
                    System.out.println("Matrícula professor:");
                    int matriculaProfessor = s.nextInt();
                    Professor professor = null;
                    for (Professor p : professores) {
                        if (p.getMatricula() == matriculaProfessor) {
                            professor = p;
                            break;
                        }
                    }
                    do {
                        Aluno a = new Aluno();
                        System.out.println("Continuar?");
                        char continuar = s.next().charAt(0);
                    } while (continuar == 's');
                    Turma t = new Turma();
                    turmas.add(t);
                    break;
                }

                case 3: {
                    for (Turma t : turmas) {
                        
                    }
                }
            }
        } while (opcao != 0);
    }
}
