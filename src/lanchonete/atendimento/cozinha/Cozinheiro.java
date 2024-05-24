package lanchonete.atendimento.cozinha;

import lanchonete.atendimento.Atendente;

public class Cozinheiro {
	//pode ser default
	public void adicionarLancheNoBalcao() {
		System.out.println("ADICIONANDO LANCHE NATURAL HAMBURGER NO BALCAO");
	}
	public void adicionarSucoNoBalcao() {
		System.out.println("ADICIONANDO SUCO NO BALCAO");
	}
	public void adicionarComboNoBalcao() {
		adicionarLancheNoBalcao();
		adicionarSucoNoBalcao();
	}
	private void preparaLanche() {
		System.out.println("PREPARANDO LANCHE TIPO HAMBURGER");
	}
	private void preparaVitamina() {
		System.out.println("PREPARANDO SUCO");
	}
	private void preparaCombo() {
		preparaLanche();
		preparaVitamina();
	}
	private void selecionaIngredientesLanche() {
		System.out.println("SELECIONANDO O PAO, SALADA, OVO E CARNE");
	}
	private void selecionaIngredientesVitamina() {
		System.out.println("SELECIONA FRUTA, LEITE E SUCO");
	}
	private void lavarIngredientes() {
		System.out.println("LAVANDO INGREDIENTES");
	}
	private void baterVitaminaLiquidificador() {
		System.out.println("BATENDO VITAMINA NO LIQUIDIFICADOR");
	}
	private void fritarIngredientesLanche() {
		System.out.println("FRITANDO A CARNE E O OVO PARA HAMBURGER");
	}
	private void pedirParaTrocarGas(Almoxarife meuAmigo) {
		meuAmigo.trocarGas();
	}
	
}
