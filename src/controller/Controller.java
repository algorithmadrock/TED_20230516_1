/*
RESUMO      : Comandos para a prova real do teste de mesa
PROGRAMADORA: Luiza Felix
DATA        : 01/06/2023
 */

package controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import br.edu.fateczl.listas.Lista;

public class Controller {
	private Lista[] tabelahash = new Lista[300];
	
	public Controller() {
		for (int i = 0; i <300;i++) {
			tabelahash[i] = new Lista(); //inicializo cada uma das posições do meu vetor como uma lista
			
		}
	}
	
	public void leitura() throws IOException {
		File arquivo = new File("C:\\sistemas operacionais i\\TED_20230516_1\\valores.csv");
		
		FileInputStream fluxo = new FileInputStream(arquivo);
		InputStreamReader leitor = new InputStreamReader(fluxo);
		BufferedReader buffer = new BufferedReader(leitor);
		
		String linha = buffer.readLine();
		String[] dados = linha.split(";");
		for (String i : dados) {
			int posicao = hash(Integer.parseInt(i));
			tabelahash[posicao].addfirst(i);
		}
		
		buffer.close();
		leitor.close();
		fluxo.close();
	}

	private int hash(int numero) {
		return (numero%300);
	}

	public void busca(int posicao) {
		
		if (tabelahash[posicao].size()>=1) {
			System.out.println(tabelahash[posicao].toString());
		} else {
			System.err.println("Não há dados nessa posição");
		}
		
	}
}
