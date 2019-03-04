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
public class Player {
    private int id;
    private String FirstName;
    private String LastName;
    private String NickName;
    
    public int getId() { return id; }
    public String getName() { return FirstName + ' ' + LastName; }
    public String getDisplayName() { return NickName == null ? getName() : NickName; }
}
