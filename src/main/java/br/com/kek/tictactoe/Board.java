package br.com.kek.tictactoe;

import java.util.Arrays;
import java.util.regex.Pattern;

import org.apache.commons.lang3.StringUtils;

import br.com.kek.tictactoe.enums.OptionMoveEnum;
import br.com.kek.tictactoe.exception.IllegalMoveException;
import br.com.kek.tictactoe.exception.IndexOutOfBoundsOnMatrix;
import br.com.kek.tictactoe.util.ConstantsUtil;

public class Board {

	private String[][] matrix;
	private int[] magicSquare;

	public Board() {
		this.matrix = ConstantsUtil.EMPTY_MATRIX;
		this.magicSquare = ConstantsUtil.MAGIC_SQUARE_ARRAY;
	}

	public void doMovement(String coordinates, OptionMoveEnum move) throws IllegalMoveException {
		int[] coordinatesSplited = getValuesFromCoordinates(coordinates);
		if (isMovementHasBeenTaken(coordinatesSplited)) {
			throw new IllegalMoveException(ConstantsUtil.MESSAGE_MOVEMENT_HAS_BEEN_TAKEN);
		}
		this.matrix[coordinatesSplited[0]][coordinatesSplited[1]] = move.getValue();
	}

	private int[] getValuesFromCoordinates(String coordinates) throws IndexOutOfBoundsOnMatrix {
		Pattern pattern = Pattern.compile(ConstantsUtil.PATTERN_COORDINATE_FORMAT);
		if (!pattern.matcher(coordinates).find()) {
			throw new IndexOutOfBoundsOnMatrix(ConstantsUtil.MESSAGE_ILLEGAL_COORDINATE_OUT_OF_BOUND_IN_MATRIX);
		}
		return Arrays.stream(coordinates.split(ConstantsUtil.DELIMITER)).mapToInt(Integer::parseInt).toArray();
	}

	private boolean isMovementHasBeenTaken(int[] coordinatesSplited) {
		return StringUtils.isNotBlank(this.matrix[coordinatesSplited[0]][coordinatesSplited[1]]);
	}

	public void printBoard() {
		for (int i = 0; i < this.matrix.length; i++) {
			if (i != this.matrix.length - 1) {
				System.out.println(this.matrix[i][0] + "|" + this.matrix[i][1] + "|" + this.matrix[i][2] + "\n-----");
			} else {
				System.out.println(this.matrix[i][0] + "|" + this.matrix[i][1] + "|" + this.matrix[i][2]);
			}
		}
	}

	public OptionMoveEnum getWinner() {
		if (hasWon(OptionMoveEnum.MOVE_X))
			return OptionMoveEnum.MOVE_X;
		else if (hasWon(OptionMoveEnum.MOVE_O))
			return OptionMoveEnum.MOVE_O;
		else
			return null;
	}

	private boolean hasWon(OptionMoveEnum player) {
		String[] board = convertBoardToUnidimencional();
		for (int i = 0; i < 9; i++)
			for (int j = 0; j < 9; j++)
				for (int k = 0; k < 9; k++)
					if (i != j && i != k && j != k)
						if (board[i] == player.getValue() && board[j] == player.getValue()
								&& board[k] == player.getValue())
							if (magicSquare[i] + magicSquare[j] + magicSquare[k] == 15)
								return true;
		return false;
	}

	private String[] convertBoardToUnidimencional() {
		String newArray[] = new String[matrix.length * matrix[0].length];
		for (int i = 0; i < matrix.length; i++) {
			String[] row = matrix[i];
			for (int j = 0; j < row.length; j++) {
				String value = matrix[i][j];
				newArray[i * row.length + j] = value;
			}
		}
		return newArray;
	}
}
