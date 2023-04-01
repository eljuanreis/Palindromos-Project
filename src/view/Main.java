package view;

import javax.swing.JOptionPane;

import controller.PalindromoController;
import stackStrings.StackStrings;

public class Main {

	static String wordReal;
	
	public static void main(String[] args) throws Exception {
		StackStrings word = Main.makeWords();
		
		PalindromoController c = new PalindromoController();
		
		String wordChanged = c.invertePalavra(word);
		Boolean palin = c.comparaPalavras(wordChanged, wordReal);
		
		if (palin) {
			JOptionPane.showMessageDialog(null, "É um palindromo");
		} else {
			JOptionPane.showMessageDialog(null, "Não é um palindromo");
		}
		
	}
	
	public static StackStrings makeWords()
	{
		StackStrings p = new StackStrings();

		String palavra = JOptionPane.showInputDialog("Digite a palavra");
		wordReal = palavra;
		
		//0 - 5
		int strLeng = palavra.length();
		int loop = 0;
		
		while (loop != strLeng) {
			String word = String.valueOf(palavra.charAt(loop));
			p.push(word);
			loop++;
		}
		
		return p;
	}

}
