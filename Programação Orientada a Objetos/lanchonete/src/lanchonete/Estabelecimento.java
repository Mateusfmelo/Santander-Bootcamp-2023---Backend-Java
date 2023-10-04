package lanchonete;

import atendimento.Atendente;
import atendimento.Cliente;
import atendimento.cozinha.Almoxarife;
import atendimento.cozinha.Cozinheiro;

public class Estabelecimento {
    
	public static void main(String[] args) {
		Cozinheiro cozinheiro = new Cozinheiro();

		//ações que estabelecimento precisa ter ciência
		cozinheiro.adicionarSucoNoPBalcao();;
		cozinheiro.adicionarLancheNoBalcao();
		cozinheiro.adicionarComboNoBalcao();

		Atendente atendente = new Atendente();
		atendente.servindoMesa();
		atendente.receberPagamento();
		
		Cliente cliente = new Cliente();
		cliente.escolherLanche();
		cliente.fazerPedido();
		cliente.pagarConta();
	}
}