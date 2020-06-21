package br.com.kek.tictactoe.exception;

import br.com.kek.tictactoe.util.MessagePropertiesUtil;

public class IllegalMoveException extends Exception {

	private static final long serialVersionUID = 1L;

	public IllegalMoveException(String message) {
		super(MessagePropertiesUtil.getMessageFromMessageFile(message));
	}

}
