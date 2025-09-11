import java.util.Scanner;

public class gerenciadorClinicaClass {
    public static void main(String[] var0) {
        Scanner var1 = new Scanner(System.in);
        FilaDeAtendimento var2 = new FilaDeAtendimento();
        PilhaHistoricoAtendimentos var3 = new PilhaHistoricoAtendimentos();

        for(boolean var4 = false; !var4; System.out.println()) {
            exibirMenu();
            int var5 = lerOpcao(var1);
            if (var5 == 1) {
                System.out.print("Nome do paciente: ");
                String var6 = var1.nextLine();
                int var7 = lerIdade(var1);
                System.out.print("Sintoma do paciente: ");
                String var8 = var1.nextLine();
                Paciente var9 = new Paciente(var6, var7, var8);
                var2.adicionarPaciente(var9);
            } else if (var5 == 2) {
                Paciente var10 = var2.atenderPaciente();
                if (var10 != null) {
                    var3.adicionarAoHistorico(var10);
                }
            } else if (var5 == 3) {
                var2.mostrarFila();
            } else if (var5 == 4) {
                var3.mostrarHistorico();
            } else if (var5 == 5) {
                var4 = true;
                System.out.println("Saindo do sistema. Até mais!");
            } else {
                System.out.println("Opção inválida. Por favor, escolha uma opção entre 1 e 5.");
            }
        }

        var1.close();
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

    private static int lerOpcao(Scanner var0) {
        while(!var0.hasNextInt()) {
            System.out.println("Entrada inválida. Por favor, digite um número.");
            var0.next();
            System.out.print("Escolha uma opção: ");
        }

        int var1 = var0.nextInt();
        var0.nextLine();
        return var1;
    }

    private static int lerIdade(Scanner var0) {
        System.out.print("Idade do paciente: ");

        while(!var0.hasNextInt()) {
            System.out.println("Entrada inválida. Por favor, digite um número para a idade.");
            var0.next();
            System.out.print("Idade do paciente: ");
        }

        int var1 = var0.nextInt();
        var0.nextLine();
        return var1;
    }
}
