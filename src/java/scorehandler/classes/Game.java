/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scorehandler.classes;

import scorehandler.enums.GameType;

/**
 *
 * @author justinli
 */
public class Game {
    private Player player1;
    private Player player2;
    private int player1Score;
    private int player2Score;
    private int raceTo;
    private GameType gameType;
    
    public Player getPlayerOne() { return player1; }
    public Player getPlayerTwo() { return player2; }
    public int getPlayerOneScore() { return player1Score; }
    public int getPlayerTwoScore() { return player2Score; }
    public int getraceTo() { return raceTo; }
}
