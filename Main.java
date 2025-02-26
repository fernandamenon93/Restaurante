public class Main {
    public static void main(String[] args) {
        Restaurante restaurante = new Restaurante();

        Prato prato1 = new Prato("Pizza Margherita", 35.00, "Molho de tomate, mussarela e manjericão");
        Prato prato2 = new Prato("Hambúrguer", 30.50, "Pão brioche, carne Angus e cheddar");
        Prato prato3 = new Prato("Salada Caesar", 20.00, "Alface, frango grelhado e molho Caesar");

        restaurante.adicionarPratoAoCardapio(prato1);
        restaurante.adicionarPratoAoCardapio(prato2);
        restaurante.adicionarPratoAoCardapio(prato3);

        restaurante.exibirCardapio();

        Pedido pedido1 = restaurante.criarPedido(101, "Fernanda");
        pedido1.adicionarPrato(prato1);
        pedido1.adicionarPrato(prato3);
        pedido1.visualizarPedido();

        Pedido pedido2 = restaurante.criarPedido(102, "Luiza");
        pedido2.adicionarPrato(prato2);
        pedido2.adicionarPrato(prato3);
        pedido2.visualizarPedido();

        restaurante.gerarRelatorioPedidos();
        restaurante.salvarCardapio();
        restaurante.salvarPedidos();
    }
}

