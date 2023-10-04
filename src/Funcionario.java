
public abstract class Funcionario {
    String nome;
    String cpf;
    String ender;
    String fone;
    String setor;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEnder() {
        return ender;
    }

    public void setEnder(String ender) {
        this.ender = ender;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public Funcionario(String nome, String cpf, String ender, String fone, String setor) {
        this.nome = nome;
        this.cpf = cpf;
        this.ender = ender;
        this.fone = fone;
        this.setor = setor;
    }

    public Funcionario(){

    }

    public static float calcularSalario(){
        return 0;
    }
}
