public class PacienteClass {
    private static int proximoId = 1;
    private int id;
    private String nome;
    private int idade;
    private String sintoma;

    public PacienteClass(String var1, int var2, String var3) {
        this.id = proximoId++;
        this.nome = var1;
        this.idade = var2;
        this.sintoma = var3;
    }

    public int getId() {
        return this.id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String var1) {
        this.nome = var1;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int var1) {
        this.idade = var1;
    }

    public String getSintoma() {
        return this.sintoma;
    }

    public void setSintoma(String var1) {
        this.sintoma = var1;
    }

    public String exibirInfo() {
        return "ID: " + this.id + " | Nome: " + this.nome + " | Idade: " + this.idade + " | Sintoma: " + this.sintoma;
    }
}


