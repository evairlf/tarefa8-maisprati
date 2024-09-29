package tarefa8;

public class Estagiario extends Funcionario {
    public Estagiario(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double calcularBonus() {
        return salario * 0.05;
    }

    @Override
    public void promover() {
        System.out.println(nome + " foi promovido a um cargo de analista.");
    }
}
