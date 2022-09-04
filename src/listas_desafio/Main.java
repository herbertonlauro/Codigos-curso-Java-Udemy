package listas_desafio;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        List<Funcionario> funcionarios = new ArrayList<>();

        System.out.print("Quantos empregados serão registrados? ");
        int numeroFuncionarios = scanner.nextInt();

        for(int i = 0; i < numeroFuncionarios; i++) {
            System.out.println();
            System.out.println("Empregado #" + (i + 1) + ": ");
            System.out.print("Id: ");
            int id = scanner.nextInt();

            while (hasId(funcionarios, id)) {
                System.out.println("Esse ID já é utilizado. Escolha outro: ");
                id = scanner.nextInt();
            }

            System.out.print("Nome: ");
            scanner.nextLine();
            String nomeFuncionario = scanner.nextLine();

            System.out.print("Salário: ");
            Double salario = scanner.nextDouble();

            Funcionario funcionario = new Funcionario(id, nomeFuncionario, salario);

            funcionarios.add(funcionario);
        }

        System.out.println();
        System.out.print("Digite o ID do funcionário que receberá aumento salarial: ");
        Integer idFuncionarioAumentoSalarial = scanner.nextInt();

        Funcionario funcionario = funcionarios.stream().filter(x -> x.getId().equals(idFuncionarioAumentoSalarial)).findFirst().orElse(null);


        if(funcionario == null) {
            System.out.println("Usuário inexistente!");
        } else {
            System.out.print("Digite a porcentagem do aumento: ");
            double porcentagemAumento = scanner.nextDouble();
            funcionario.aumentarSalary(porcentagemAumento);
        }

        System.out.println();
        System.out.println("List of employees:");
        for (Funcionario e : funcionarios) {
            System.out.println(e);
        }

        scanner.close();
    }

    public static boolean hasId(List<Funcionario> list, int id) {
        Funcionario emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }
}
