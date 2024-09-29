package tarefa7;

public class Boleto extends FormaPagamento {
    @Override
    public void processarPagamento(double valor) {
        if (validarPagamento(valor)) {
            System.out.println("Pagamento de R$" + valor + " processado via Boleto.");
        } else {
            System.out.println("Pagamento inválido com Boleto.");
        }
    }

    @Override
    public boolean validarPagamento(double valor) {
        return valor > 0 && valor <= 1000;
    }
}
