public class Pagamentos {
    private String metodo;
    private double valor;

    public Pagamentos(String metodo, double valor) {
        this.metodo = metodo;
        this.valor = valor;
    }

    public void processar() {
        System.out.println("💳 Pagamento de R$" + valor + " via " + metodo + " processado.");
    }
}
