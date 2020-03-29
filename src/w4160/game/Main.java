package w4160.game;

import w4160.engine.GameEngine;
import w4160.engine.IControlLogic;
 
public class Main {
 
    public static void main(String[] args) {
    	
    	try {
            boolean vSync = true;
            
            //IControlLogic gameLogic = (args.length == 0 || args[0].length() == 0) ? new SimpleGame() : new SimpleGame(args[0]);
            IControlLogic gameLogic; 
            
            if (args.length == 0 || args[0].length() == 0) {
                gameLogic = new SimpleGame(); 
            } 
            else {
                
                String[] allArgs = args[0].split(" ");

                if (allArgs.length == 1) {
                    gameLogic = new SimpleGame(allArgs[0]); 
                } 
                else {
                    gameLogic = new SimpleGame(allArgs[0], allArgs[1]); 
                } 
                
            }

            
            GameEngine gameEng = new GameEngine("COMS W4160-GAME", 600, 480, vSync, gameLogic);
            
            // start to run the game
            gameEng.start();
            
        } catch (Exception excp) {
        	
            excp.printStackTrace();
            System.exit(-1);
        }
    }
}
