package tarefa7;

public class CartaoCredito extends FormaPagamento {
    @Override
    public void processarPagamento(double valor) {
        if (validarPagamento(valor)) {
            System.out.println("Pagamento de R$" + valor + " processado via Cartão de Crédito.");
        } else {
            System.out.println("Pagamento inválido com Cartão de Crédito.");
        }
    }

    @Override
    public boolean validarPagamento(double valor) {
        return valor > 0 && valor <= 5000;
    }
}
