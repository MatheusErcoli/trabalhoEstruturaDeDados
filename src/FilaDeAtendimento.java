import java.util.LinkedList;

public class FilaDeAtendimento {
    private LinkedList<Paciente> fila;

    public FilaDeAtendimento() {
        this.fila = new LinkedList<>();
    }

    public void adicionarPaciente(Paciente p) {
        fila.add(p);
        System.out.println("Paciente " + p.getNome() + " adicionado à fila.");
    }

    public Paciente atenderPaciente() {
        if (fila.isEmpty()) {
            System.out.println("A fila de atendimento está vazia.");
            return null;
        } else {
            Paciente pacienteAtendido = fila.removeFirst();
            System.out.println("Paciente " + pacienteAtendido.getNome() + " atendido.");
            return pacienteAtendido;
        }
    }

    public boolean estaVazia() {
        return fila.isEmpty();
    }

    public void mostrarFila() {
        if (fila.isEmpty()) {
            System.out.println("A fila de atendimento está vazia.");
            return;
        }
        System.out.println("\n--- Fila de Atendimento ---");
        for (Paciente p : fila) {
            System.out.println(p.exibirInfo());
        }
        System.out.println("---------------------------");
    }
}


