package controller;

import stackStrings.StackStrings;

public class PalindromoController {

	public String invertePalavra(StackStrings palavra) throws Exception {
		StringBuffer s = new StringBuffer();

		while (!palavra.isEmpty()) {
			s.append(palavra.pop());
		}
		
		return s.toString();
	}
	
	public boolean comparaPalavras(String stOne, String stTwo) {
		if (stOne.contains(stTwo)) {
			return true;
		}
		
		return false;
	}

}
