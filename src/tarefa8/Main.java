package tarefa8;

public class Main {
    public static void main(String[] args) {
        GestorDeFuncionarios gestor = new GestorDeFuncionarios();

        Funcionario gerente = new Gerente("Alice", 5000);
        Funcionario desenvolvedor = new Desenvolvedor("Bob", 4000);
        Funcionario estagiario = new Estagiario("Carlos", 2000);

        gestor.adicionarFuncionario(gerente);
        gestor.adicionarFuncionario(desenvolvedor);
        gestor.adicionarFuncionario(estagiario);

        gestor.calcularFolhaPagamento();

        gerente.promover();
        desenvolvedor.promover();
        estagiario.promover();
    }
}
