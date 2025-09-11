import java.util.Stack;

public class PilhaHistoricoAtendimentosClass {
    private Stack<Paciente> historico = new Stack();

    public void adicionarAoHistorico(Paciente var1) {
        this.historico.push(var1);
        System.out.println("Paciente " + var1.getNome() + " adicionado ao histórico.");
    }

    public Paciente verUltimoAtendido() {
        if (this.historico.isEmpty()) {
            System.out.println("O histórico de atendimentos está vazio.");
            return null;
        } else {
            return (Paciente)this.historico.peek();
        }
    }

    public void mostrarHistorico() {
        if (this.historico.isEmpty()) {
            System.out.println("O histórico de atendimentos está vazio.");
        } else {
            System.out.println("\n--- Histórico de Atendimentos (Mais Recente para Mais Antigo) ---");

            for(int var1 = this.historico.size() - 1; var1 >= 0; --var1) {
                System.out.println(((Paciente)this.historico.get(var1)).exibirInfo());
            }

            System.out.println("---------------------------------------------------");
        }
    }
}
