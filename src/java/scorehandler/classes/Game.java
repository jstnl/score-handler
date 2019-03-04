/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scorehandler.classes;

/**
 *
 * @author justinli
 */
public class Game {
    private enum GameType {
        EIGHTBALL,
        NINEBALL,
        TENBALL,
        STRAIGHTPOOL,
        ONEPOCKET
    }
    
    private Player player1;
    private Player player2;
    private int player1Score;
    private int player2Score;
    private int raceTo;
    private 
    
    public Player getPlayerOne() { return player1; }
    public Player getPlayerTwo() { return player2; }
    public int getPlayerOneScore() { return player1Score; }
    public int getPlayerTwoScore() { return player2Score; }
    public int getraceTo() { return raceTo; }
}
