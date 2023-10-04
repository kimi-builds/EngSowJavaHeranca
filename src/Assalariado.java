import javax.swing.*;

public class Assalariado extends Funcionario {
    float salario;

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public Assalariado(String nome, String cpf, String ender, String fone, String setor, float salario) {
        super(nome, cpf, ender, fone, setor);
        this.salario = salario;
    }

    public static float calcularSalario() {
        float salario;
        salario = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe seu salário mensal."));
        return salario;
    }
}

