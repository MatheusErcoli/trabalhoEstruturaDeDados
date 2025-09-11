import java.util.Stack;

public class PilhaHistoricoAtendimentos {
    private Stack<Paciente> historico;

    public PilhaHistoricoAtendimentos() {
        this.historico = new Stack<>();
    }

    public void adicionarAoHistorico(Paciente p) {
        historico.push(p);
        System.out.println("Paciente " + p.getNome() + " adicionado ao histórico.");
    }

    public Paciente verUltimoAtendido() {
        if (historico.isEmpty()) {
            System.out.println("O histórico de atendimentos está vazio.");
            return null;
        } else {
            return historico.peek();
        }
    }

    public void mostrarHistorico() {
        if (historico.isEmpty()) {
            System.out.println("O histórico de atendimentos está vazio.");
            return;
        }
        System.out.println("\n--- Histórico de Atendimentos (Mais Recente para Mais Antigo) ---");
        for (int i = historico.size() - 1; i >= 0; i--) {
            System.out.println(historico.get(i).exibirInfo());
        }
        System.out.println("---------------------------------------------------");
    }
}


