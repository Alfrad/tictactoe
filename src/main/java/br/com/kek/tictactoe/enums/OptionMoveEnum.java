package br.com.kek.tictactoe.enums;

public enum OptionMoveEnum {

	MOVE_X("X"), MOVE_O("O");

	private String value;

	private OptionMoveEnum(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public OptionMoveEnum getReversePlayer() {
		return this.getValue().equals(MOVE_X.getValue()) ? MOVE_O : MOVE_X;
	}
}
