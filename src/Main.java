import javax.swing.*;
import java.util.ArrayList;

public class Main {
    static ArrayList<Object> funcs=new ArrayList<>();
    public static void main(String[] args) {
        char opc;
        do{
            opc=JOptionPane.showInputDialog(null,"Bem-vindo ao sistema que calcula o salário dos funcionários. Observe as opções e selecione a que desejar\n\nH - Inserir horista\nA - Inserir assalariado\nR - Reajuste percentual no salário de todos os funcionários (você também verá os novos salários)\nL - Listar dados e salário devido por funcionário\nS - Sair").charAt(0);
            opc=Character.toLowerCase(opc);
            switch(opc){
                case 'h' -> {
                    if(funcs.size()<10) {
                        String nome = JOptionPane.showInputDialog(null, "Informe o nome do funcionário.");
                        String cpf = JOptionPane.showInputDialog(null, "Informe o CPF do funcionário.");
                        String ender = JOptionPane.showInputDialog(null, "Informe o endereço do funcionário.");
                        String fone = JOptionPane.showInputDialog(null, "Informe o telefone do funcionário.");
                        String setor = JOptionPane.showInputDialog(null, "Informe o setor do funcionário.");
                        float valorHora = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe o valor da hora trabalhada."));
                        float horasTrabalhadas = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe a quantidade de horas trabalhadas."));
                        Horista h = new Horista(nome, cpf, ender, fone, setor, valorHora, horasTrabalhadas);
                        JOptionPane.showMessageDialog(null, "O salário do funcionário é de R$" + Horista.calcularSalario());
                        funcs.add(h);
                    } else JOptionPane.showMessageDialog(null,"Você não pode inserir mais funcionários.");
                }
                case 'a'->{
                    if(funcs.size()<10){
                    String nome = JOptionPane.showInputDialog(null, "Informe o nome do funcionário.");
                    String cpf = JOptionPane.showInputDialog(null, "Informe o CPF do funcionário.");
                    String ender = JOptionPane.showInputDialog(null, "Informe o endereço do funcionário.");
                    String fone = JOptionPane.showInputDialog(null, "Informe o telefone do funcionário.");
                    String setor = JOptionPane.showInputDialog(null, "Informe o setor do funcionário.");
                    Assalariado a = new Assalariado(nome, cpf, ender, fone, setor, Assalariado.calcularSalario());
                    funcs.add(a);
                }
                    else JOptionPane.showMessageDialog(null,"Você não pode inserir mais funcionários.");
                }
                case 'l'->
                    JOptionPane.showMessageDialog(null,listar());
                case 'r'->{
                    if(!funcs.isEmpty()) {
                        int c2=0;
                        int reajuste=Integer.parseInt(JOptionPane.showInputDialog(null,"Informe o percentual de reajuste."));
                        for (int c = 0; c < funcs.size(); c++) {
                            c2++;
                            if (funcs.get(c) instanceof Horista) {
                                ((Horista) funcs.get(c)).setValorHora(((Horista) funcs.get(c)).getValorHora() * ((reajuste + 100)) / 100);
                                JOptionPane.showMessageDialog(null, "O novo salário do funcionário " + c2 + " (horista) é de R$" +Horista.calcularSalario());
                            } else if (funcs.get(c) instanceof Assalariado) {
                                ((Assalariado) funcs.get(c)).setSalario(((Assalariado) funcs.get(c)).getSalario() * ((reajuste + 100)) / 100);
                                JOptionPane.showMessageDialog(null, "O novo salário do funcionário " + c2 + " (assalariado) é de R$" + ((Assalariado) funcs.get(c)).getSalario());
                            }
                        }
                    } else JOptionPane.showMessageDialog(null,"Está vazia a lista de funcionários.");
                }
            }

        }while(opc != 's');
    }
    public static String listar(){
        String msg="";
        if(!funcs.isEmpty()) {
            int c2=0;
            for (int c = 0; c < funcs.size(); c++) {
                c2++;
                if (funcs.get(c) instanceof Horista) {
                    msg += "Nome do funcionário " + c2 + " (horista): " + ((Horista) funcs.get(c)).getNome() + "\n" + "CPF do horista: " + ((Horista) funcs.get(c)).getCpf() + "\n" + "Endereço do horista: " + ((Horista) funcs.get(c)).getEnder() + "\n" + "Telefone do horista: " + ((Horista) funcs.get(c)).getFone() + "\n" + "Setor do horista: " + ((Horista) funcs.get(c)).getSetor() + "\n" + "Salário do horista: R$" + Horista.calcularSalario() + "\n\n";
                } else if (funcs.get(c) instanceof Assalariado) {
                    msg+= "Nome do funcionário " + c2 + " (assalariado): " + (((Assalariado) funcs.get(c)).getNome()) + "\nCPF do assalariado: " + ((Assalariado) funcs.get(c)).getCpf() + "\nEndereço do assalariado: " + ((Assalariado) funcs.get(c)).getEnder() + "\nTelefone do assalariado: " + ((Assalariado) funcs.get(c)).getFone() + "\nSetor do assalariado: " + ((Assalariado) funcs.get(c)).getSetor() + "\nSalário do assalariado: R$" + ((Assalariado) funcs.get(c)).getSalario() + "\n\n";
                }
            }
        } else msg="Está vazia a lista de funcionários.";
        return msg;
    }
}