package br.com.kek.tictactoe.util;

public class ConstantsUtil {

	public static final String DELIMITER = ",";
	public static final String MESSAGE_MOVEMENT_HAS_BEEN_TAKEN = "exception.position.has.been.taken";
	public static final String MESSAGE_ILLEGAL_COORDINATE_OUT_OF_BOUND_IN_MATRIX = "exception.index.out.of.bound.in.matrix";
	public static final String[][] EMPTY_MATRIX = { { " ", " ", " " }, { " ", " ", " " }, { " ", " ", " " } };
	public static final String PATTERN_COORDINATE_FORMAT = "([0-2]{1}),([0-2]{1})";
	public static final int[] MAGIC_SQUARE_ARRAY = { 4, 9, 2, 3, 5, 7, 8, 1, 6 };

}
