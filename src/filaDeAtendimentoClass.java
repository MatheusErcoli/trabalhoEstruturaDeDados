import java.util.LinkedList;
public class filaDeAtendimentoClass {
    private LinkedList<Paciente> fila = new LinkedList();

    public void adicionarPaciente(Paciente var1) {
        this.fila.add(var1);
        System.out.println("Paciente " + var1.getNome() + " adicionado à fila.");
    }

    public Paciente atenderPaciente() {
        if (this.fila.isEmpty()) {
            System.out.println("A fila de atendimento está vazia.");
            return null;
        } else {
            Paciente var1 = (Paciente) this.fila.removeFirst();
            System.out.println("Paciente " + var1.getNome() + " atendido.");
            return var1;
        }
    }

    public boolean estaVazia() {
        return this.fila.isEmpty();
    }

    public void mostrarFila() {
        if (this.fila.isEmpty()) {
            System.out.println("A fila de atendimento está vazia.");
        } else {
            System.out.println("\n--- Fila de Atendimento ---");

            for (Paciente var2 : this.fila) {
                System.out.println(var2.exibirInfo());
            }

            System.out.println("---------------------------");
        }
    }
}
