import java.util.*;
class Restaurante {
    private List<Prato> cardapio = new ArrayList<>();
    private List<Pedido> pedidos = new ArrayList<>();

    public void adicionarPratoAoCardapio(Prato prato) {
        cardapio.add(prato);
        System.out.println("Prato adicionado ao cardápio: " + prato.getNome());
    }

    public void removerPratoDoCardapio(Prato prato) {
        if (cardapio.remove(prato)) {
            System.out.println("Prato removido do cardápio: " + prato.getNome());
        } else {
            System.out.println("Prato não encontrado no cardápio.");
        }
    }

    public void exibirCardapio() {
        System.out.println("\nCardápio do Restaurante:");
        for (Prato prato : cardapio) {
            prato.exibirInfo();
        }
    }

    public Pedido criarPedido(int numeroPedido, String cliente) {
        Pedido pedido = new Pedido(numeroPedido, cliente);
        pedidos.add(pedido);
        System.out.println("Novo pedido criado para: " + cliente);
        return pedido;
    }

    public void gerarRelatorioPedidos() {
        System.out.println("\n Relatório de Pedidos");
        double totalGeral = 0;
        for (Pedido pedido : pedidos) {
            pedido.visualizarPedido();
            totalGeral += pedido.getTotal();
        }
        System.out.println("Total geral de todos os pedidos: R$" + totalGeral);
    }

    public void salvarCardapio() {
        System.out.println("\n[Simulação] Cardápio salvo com sucesso!");
    }

    public void salvarPedidos() {
        System.out.println("\n[Simulação] Pedidos salvos com sucesso!");
    }
}