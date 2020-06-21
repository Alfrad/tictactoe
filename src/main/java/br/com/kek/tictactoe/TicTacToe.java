package br.com.kek.tictactoe;

import java.util.Scanner;

import br.com.kek.tictactoe.enums.OptionMoveEnum;
import br.com.kek.tictactoe.exception.IllegalMoveException;
import br.com.kek.tictactoe.exception.IndexOutOfBoundsOnMatrix;
import br.com.kek.tictactoe.util.ConsoleCleannerUtil;

public class TicTacToe {

	private Scanner scan;

	public TicTacToe() {
		scan = new Scanner(System.in);
	}

	public void letsPlayTheGame(Board board, OptionMoveEnum player) {
		OptionMoveEnum winner = board.getWinner();
		if (winner != null) {
			System.out.println("Player " + winner.getValue() + " is the winner!");
			return;
		}
		
		System.out.println("Player " + player.getValue() + " make your move:");
		String move = this.scan.nextLine();

		try {
			board.doMovement(move, player);
			ConsoleCleannerUtil.clrscr();
			board.printBoard();
			letsPlayTheGame(board, player.getReversePlayer());
		} catch (IllegalMoveException | IndexOutOfBoundsOnMatrix ex) {
			ConsoleCleannerUtil.clrscr();
			System.out.println(ex.getMessage());
			letsPlayTheGame(board, player);
		}
	}

	public static void main(String[] args) throws IllegalMoveException {
		TicTacToe ticTacToe = new TicTacToe();
		ticTacToe.letsPlayTheGame(new Board(), OptionMoveEnum.MOVE_X);
	}

}
