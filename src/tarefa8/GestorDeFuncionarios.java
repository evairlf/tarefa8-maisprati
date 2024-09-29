package tarefa8;

import java.util.ArrayList;
import java.util.List;

public class GestorDeFuncionarios {
    private List<Funcionario> funcionarios;

    public GestorDeFuncionarios() {
        this.funcionarios = new ArrayList<>();
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public void calcularFolhaPagamento() {
        double totalSalarios = 0;
        double totalBonuses = 0;

        for (Funcionario funcionario : funcionarios) {
            totalSalarios += funcionario.getSalario();
            totalBonuses += funcionario.calcularBonus();
        }

        System.out.println("Total de Salários: R$" + totalSalarios);
        System.out.println("Total de Bonificações: R$" + totalBonuses);
    }
}
