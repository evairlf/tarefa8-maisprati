package tarefa4;

public class Main {
    public static void main(String[] args) {
        Funcionario gerente = new Gerente("Alice", 5000);
        Funcionario desenvolvedor = new Desenvolvedor("Bob", 4000);

        // Chamando o método trabalhar
        gerente.trabalhar();
        desenvolvedor.trabalhar();

        // Exibindo informações do funcionário
        System.out.println("Funcionário: " + gerente.getNome() +
                ", Salário: " + gerente.getSalario() +
                ", Bônus: " + gerente.calcularBonus());

        System.out.println("Funcionário: " + desenvolvedor.getNome() +
                ", Salário: " + desenvolvedor.getSalario() +
                ", Bônus: " + desenvolvedor.calcularBonus());
    }
}
