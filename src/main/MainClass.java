package main;

import exceptions.IsiLexicalException;
import lexico.IsiScanner;
import lexico.Token;

public class MainClass {
	public static void main(String[] args) {
		try {
			IsiScanner sc = new IsiScanner("input.isi");
			Token token = null;
			do {
				token = sc.nextToken();
				if (token != null) {
					System.out.println(token);
				}
			}while(token != null);
		}catch(IsiLexicalException ex) {
			System.out.println("Lexical Error "+ex.getMessage());
		}
		catch(Exception ex) {
			System.out.println("Generic Error!");
		}
		
		
	}
}
