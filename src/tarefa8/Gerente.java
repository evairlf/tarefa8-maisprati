package tarefa8;

public class Gerente extends Funcionario {
    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double calcularBonus() {
        return salario * 0.20; // 20% do salário
    }

    @Override
    public void promover() {
        System.out.println(nome + " foi promovido a um cargo superior.");
    }
}
