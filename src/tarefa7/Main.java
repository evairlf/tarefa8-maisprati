package tarefa7;

public class Main {
    public static void main(String[] args) {
        FormaPagamento cartao = new CartaoCredito();
        FormaPagamento boleto = new Boleto();
        FormaPagamento pix = new Pix();

        double valorPagamento1 = 3000;
        double valorPagamento2 = 1500;
        double valorPagamento3 = 200;


        cartao.processarPagamento(valorPagamento1);
        cartao.processarPagamento(6000);

        boleto.processarPagamento(valorPagamento2);
        boleto.processarPagamento(valorPagamento3);

        pix.processarPagamento(valorPagamento3);
        pix.processarPagamento(-100);
    }
}
