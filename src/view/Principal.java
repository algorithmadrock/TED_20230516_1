/*
RESUMO      : Classe principal do teste de mesa
PROGRAMADORA: Luiza Felix
DATA        : 01/06/2023
 */

package view;

import java.io.IOException;

import javax.swing.JOptionPane;

import controller.Controller;

public class Principal {

	public static void main(String[] args) throws IOException {
		
		Controller teste = new Controller();
		JOptionPane.showMessageDialog(null, "Ao confirmar a prova real do exercício será executada. ***O teste de mesa foi feito em um arquivo .docx, mas preferi entregar sua prova real");
		teste.leitura();
		
		
		int opcao = 0;
		do {
			opcao = Integer.parseInt(JOptionPane.showInputDialog("1 - buscar uma posição na tabela hash\n 0 - SAIR"));
			if (opcao == 1) {
				int posicao = Integer.parseInt(JOptionPane.showInputDialog("Digite uma posição para ser buscada dentro da tabela"));
				teste.busca(posicao);
			}
		}while (opcao!=0);
	}

}
