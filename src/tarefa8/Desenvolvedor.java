package tarefa8;

public class Desenvolvedor extends Funcionario {
    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double calcularBonus() {
        return salario * 0.10;
    }

    @Override
    public void promover() {
        System.out.println(nome + " foi promovido a um cargo de líder de equipe.");
    }
}