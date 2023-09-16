package view;

import javax.swing.JOptionPane;

import controller.PushPopVetorController;

public class Principal {

	public static void main(String[] args) {
		PushPopVetorController pilhar = new PushPopVetorController();
		int vetor[] = {0, 5, 7, -4, 3, 5, -2, -1, 10, 4, 3, -6, 2, -9, 1, -5};
		JOptionPane.showMessageDialog(null, "Sequencia de 'push' e 'pop' de um vetor com as seguintes regras: \nCaso seja um número positivo ou 0, e feito o push do valor "
				+ "\nCaso seja um número negativo, e feito o pop de 2 valores e sua soma, em seguida e feito o push do número negativo e o push do resultado da soma");
		pilhar.verificaValor(vetor);
	}

}
