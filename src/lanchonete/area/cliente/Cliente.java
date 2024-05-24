package lanchonete.area.cliente;

public class Cliente {
	public void escolherLanche() {
		System.out.println("ESCOLHENDO O LANCHE");
	}
	public void fazerPedido() {
		System.out.println("FAZENDO O PEDIDO");
	}
	public void pagandoConta() {
		consultaSaldoAplicativo();
		System.out.println("PAGANDO A CONTA");
	}
	private void consultaSaldoAplicativo() {
		System.out.println("CONSULTANDO SALDO NO APLICATIVO");
	}
}
