package tarefa1;

public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto("Camiseta", 29.99, 10);
        System.out.println(produto);

        produto.setPreco(24.99);
        produto.setQuantidadeEmEstoque(15);
        System.out.println(produto);

        try {
            produto.setPreco(-5);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}