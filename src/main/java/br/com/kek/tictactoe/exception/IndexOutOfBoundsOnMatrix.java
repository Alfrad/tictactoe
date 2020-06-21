package br.com.kek.tictactoe.exception;

import br.com.kek.tictactoe.util.MessagePropertiesUtil;

public class IndexOutOfBoundsOnMatrix extends IndexOutOfBoundsException {

	private static final long serialVersionUID = 1L;

	public IndexOutOfBoundsOnMatrix(String message) {
		super(MessagePropertiesUtil.getMessageFromMessageFile(message));
	}

}
