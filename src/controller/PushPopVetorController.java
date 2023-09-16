package controller;

import model.PilhaInt;

public class PushPopVetorController {
	
	public void verificaValor(int vetor[]) {
		PilhaInt p = new PilhaInt();
		int tamanho = vetor.length;
		for (int elemento = 0; elemento < tamanho; elemento++) {
			
			//Se o valor no vetor for positivo
			if (vetor[elemento] >= 0) {	
				p.push(vetor[elemento]);	//Adiciona o valor do vetor à pilha
				
			}else { //Se o valor for negativo
				try {
					int valor = p.pop();	//Armazena o valor do topo da pilha na variável
					valor += p.pop();		//Faz a soma do primeiro valor do topo e o seu próximo topo
					p.push(vetor[elemento]);//Adiciona o elemento negativo na pilha
					p.push(valor); //Adiciona a soma dos 2 primeiros valores anteriores da pilha
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}
		}
		size(p);
	}

	public void size(PilhaInt p) {
		System.out.println("Tamanho da pilha após ler o vetor: "+p.size());	//Mostra o tamanho da pilha passada como parâmetro
	}

}
