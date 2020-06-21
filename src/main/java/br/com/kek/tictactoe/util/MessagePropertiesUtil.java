package br.com.kek.tictactoe.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.commons.lang3.StringUtils;

import br.com.kek.tictactoe.TicTacToe;

public class MessagePropertiesUtil {

	public static String getMessageFromMessageFile(String key) {
		try (InputStream input = TicTacToe.class.getClassLoader().getResourceAsStream("messages.properties")) {
			Properties prop = new Properties();
			prop.load(input);
			return prop.getProperty(key);
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		return StringUtils.EMPTY;
	}

}
