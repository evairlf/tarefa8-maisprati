package tarefa2;

public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto("Camiseta", 29.99, 10);
        System.out.println(produto);

        produto.aplicarDesconto(20);
        System.out.println("Após aplicar desconto de 20%: " + produto);

        try {
            produto.aplicarDesconto(60);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            produto.aplicarDesconto(-10);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}