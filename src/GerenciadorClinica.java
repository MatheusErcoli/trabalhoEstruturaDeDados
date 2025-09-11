import java.util.Scanner;

public class GerenciadorClinica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FilaDeAtendimento fila = new FilaDeAtendimento();
        PilhaHistoricoAtendimentos historico = new PilhaHistoricoAtendimentos();

        boolean sair = false;
        while (!sair) {
            exibirMenu();
            int opcao = lerOpcao(scanner);

            if (opcao == 1) {
                System.out.print("Nome do paciente: ");
                String nome = scanner.nextLine();
                int idade = lerIdade(scanner);
                System.out.print("Sintoma do paciente: ");
                String sintoma = scanner.nextLine();
                Paciente novoPaciente = new Paciente(nome, idade, sintoma);
                fila.adicionarPaciente(novoPaciente);
            } else if (opcao == 2) {
                Paciente pacienteAtendido = fila.atenderPaciente();
                if (pacienteAtendido != null) {
                    historico.adicionarAoHistorico(pacienteAtendido);
                }
            } else if (opcao == 3) {
                fila.mostrarFila();
            } else if (opcao == 4) {
                historico.mostrarHistorico();
            } else if (opcao == 5) {
                sair = true;
                System.out.println("Saindo do sistema. Até mais!");
            } else {
                System.out.println("Opção inválida. Por favor, escolha uma opção entre 1 e 5.");
            }
            System.out.println(); // Linha em branco para melhor legibilidade
        }
        scanner.close();
    }

    private static void exibirMenu() {
        System.out.println("===================================================");
        System.out.println("1. Adicionar novo paciente à fila");
        System.out.println("2. Atender próximo paciente");
        System.out.println("3. Exibir fila de atendimento");
        System.out.println("4. Exibir histórico de atendimentos");
        System.out.println("5. Sair");
        System.out.println("===================================================");
        System.out.print("Escolha uma opção: ");
    }

    private static int lerOpcao(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.println("Entrada inválida. Por favor, digite um número.");
            scanner.next(); // Consumir a entrada inválida
            System.out.print("Escolha uma opção: ");
        }
        int opcao = scanner.nextInt();
        scanner.nextLine(); // Consumir o restante da linha
        return opcao;
    }

    private static int lerIdade(Scanner scanner) {
        System.out.print("Idade do paciente: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Entrada inválida. Por favor, digite um número para a idade.");
            scanner.next(); // Consumir a entrada inválida
            System.out.print("Idade do paciente: ");
        }
        int idade = scanner.nextInt();
        scanner.nextLine(); // Consumir o restante da linha
        return idade;
    }
}


