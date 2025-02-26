import java.util.*;
class Pedido {
    private int numeroPedido;
    private String cliente;
    private List<Prato> listaDePratos;
    private double total;

    public Pedido(int numeroPedido, String cliente) {
        this.numeroPedido = numeroPedido;
        this.cliente = cliente;
        this.listaDePratos = new ArrayList<>();
        this.total = 0;
    }

    public void adicionarPrato(Prato prato) {
        listaDePratos.add(prato);
        total += prato.getPreco();
        System.out.println("Prato adicionado: " + prato.getNome());
    }

    public void removerPrato(Prato prato) {
        if (listaDePratos.remove(prato)) {
            total -= prato.getPreco();
            System.out.println("Prato removido: " + prato.getNome());
        } else {
            System.out.println("Prato não encontrado.");
        }
    }

    public double getTotal() { return total; }

    public void visualizarPedido() {
        System.out.println("Pedido Nº: " + numeroPedido + " | Cliente: " + cliente);
        listaDePratos.forEach(Prato::exibirInfo);
        System.out.println("Total: R$" + total);
    }
}