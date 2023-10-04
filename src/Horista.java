public class Horista extends Funcionario{
    static float valorHora;
    static float horasTrabalhadas;

    public float getValorHora(){
        return valorHora;
    }

    public void setValorHora(float valorHora){
        Horista.valorHora = valorHora;
    }

    public float getHorasTrabalhadas(){
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(float horasTrabalhadas){
        Horista.horasTrabalhadas = horasTrabalhadas;
    }

    public Horista(String nome, String cpf, String ender, String fone, String setor, float valorHora, float horasTrabalhadas){
        super(nome, cpf, ender, fone, setor);
        Horista.valorHora = valorHora;
        Horista.horasTrabalhadas = horasTrabalhadas;
    }

    public static float calcularSalario(){
        float salario;
        salario = valorHora * horasTrabalhadas;
        return salario;
    }
}
