/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scorehandler.helpers;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import scorehandler.enums.GameType;

/**
 *
 * @author justinli
 */
public class DatabaseHelper {
    private static final String DATABASE_URL = "jdbc:sqlserver://localhost:1433;databaseName=Q1BilliardsRankingDB;user=sa;password=q1billiards!";
    
    public static void createGame() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            Connection conn = DriverManager.getConnection(DATABASE_URL);
            Statement st = conn.createStatement();
            st.executeUpdate("INSERT INTO game_record " + 
                    "VALUES (1,2,1,2,1," + getCurrentTime() + ",null," + GameType.EIGHTBALL);
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }        
    }
    
    private static String getCurrentTime() {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        return sdf.format(cal.getTime());
    }
}
