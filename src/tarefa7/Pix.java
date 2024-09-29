package tarefa7;

public class Pix extends FormaPagamento {
    @Override
    public void processarPagamento(double valor) {
        if (validarPagamento(valor)) {
            System.out.println("Pagamento de R$" + valor + " processado via Pix.");
        } else {
            System.out.println("Pagamento inválido com Pix.");
        }
    }

    @Override
    public boolean validarPagamento(double valor) {
        return valor > 0;
    }
}
