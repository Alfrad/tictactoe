package br.com.kek.tictactoe.util;

import java.io.IOException;

public class ConsoleCleannerUtil {

	public static void clrscr() {
		try {
			if (System.getProperty("os.name").contains("Windows"))
				new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			else
				Runtime.getRuntime().exec("clear");
		} catch (IOException | InterruptedException ex) {}
	}
}