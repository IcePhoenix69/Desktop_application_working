package it.cineca.hr.desktop_application_working.buildlogic;

import it.cineca.hr.desktop_application_working.persistence.LocalStorageImpl;
import it.cineca.hr.desktop_application_working.computationlogic.GameLogic;
import it.cineca.hr.desktop_application_working.gamezone.IStorage;
import it.cineca.hr.desktop_application_working.gamezone.SudokuGame;
import it.cineca.hr.desktop_application_working.logic.ControlLogic;
import it.cineca.hr.desktop_application_working.userinterface.IUserInterfaceContract;

import java.io.IOException;

public class SudokuBuildLogic {
   public static void build(IUserInterfaceContract.View userInterface) throws IOException{
      SudokuGame initialState;
      IStorage storage = new LocalStorageImpl();
      try {
         initialState = storage.getGameData();
      }
      catch (IOException e){
         initialState= GameLogic.getNewGame();
         storage.updateGameData(initialState);
      }
      IUserInterfaceContract.EventListener uiLogic = new ControlLogic(storage,userInterface);
      userInterface.setListener(uiLogic);
      userInterface.updateBoard(initialState);
   }
}
