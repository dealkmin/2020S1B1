package br.com.app.fatec;

import br.com.modelo.fatec.Agenda;
import br.com.modelo.fatec.Pessoa;
import br.com.negocio.fatec.AsciiArt;
import br.com.negocio.fatec.Controle;
import br.com.negocio.fatec.Menu;

public class App {
	public static void main(String[] args) {
		AsciiArt.printAsciiArt("Agenda");
		Menu menu = new Menu();
		Agenda agenda = new Agenda();
		int op = 1000;
		while(op != 0) {
			menu.imprimirMenu();
			Controle controle = new Controle();
			op = controle.opcao();
			switch (op) {
			case 1:
				agenda.cadastrarPessoa();
				break;
			case 2:
				agenda.imprimirClientes();
			default:
				menu.imprimirMenu();
			}
		}
		
	}
}








