package it.cineca.hr.desktop_application_working.gamezone;

import it.cineca.hr.desktop_application_working.computationlogic.SudokuUtilities;
import it.cineca.hr.desktop_application_working.constant.GameState;

import java.io.Serializable;

public class SudokuGame implements Serializable {
   private final GameState gameState;
   private final int[][] gridState;

   public static final int GRID_BOUNDARY = 9;

   public SudokuGame(GameState gameState, int[][] gridState){
      this.gameState = gameState;
      this.gridState = gridState;
   }

   public GameState getGameState() {
      return gameState;
   }

   public int[][] getCopyOfGridState() {
      return SudokuUtilities.copyToNewArray(gridState);
   }

}
