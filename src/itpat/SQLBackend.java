/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itpat;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author adamdanielgreen
 */
public class SQLBackend {

    private Connection conn;

    private static String username;
    private static int count;
    private static String productionName;
    private static String usertype;
    private static String seatLetter;
    private static int seatNumber;

    public SQLBackend() {
        String databaseURL = "jdbc:ucanaccess://UserSpecsTable.accdb";
        try {
            conn = DriverManager.getConnection(databaseURL);
        } catch (SQLException ex) {
            System.out.println("Cannot connect to database:" + ex);
        }

    }

    public ResultSet getResults(String query) {
        ResultSet rs = null;
        try {
            Statement stmt = conn.createStatement();
            rs = stmt.executeQuery(query);
        } catch (SQLException ex) {
            System.out.println("Could not execute query:" + ex);
        }
        return rs;
    }

    public boolean isValidCredentials(String username, String password) {
        boolean let_in = false;

        ResultSet rs = getResults("SELECT * FROM UserSpecs WHERE UsernameLogin ='" + username + "'");

        try {

            if (rs.next()) {
                if (rs.getString("passwordLogin").equals(password)) {
                    return true;

                }

            }
        } catch (SQLException ex) {
            System.out.println("Error with result set:" + ex);
        }
//System.out.println("SELECT * FROM UserSpecs WHERE UsernameLogin ='" + username + "'");
        return let_in;

    }

    public void Update(String query) {
        try {
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(query);
        } catch (SQLException ex) {
            System.out.println("Could not update database: " + ex);
        }
    }

    public boolean isValidUsertype(String loginType) { 
        boolean let_in = false;                         

        ResultSet rs = getResults("SELECT * FROM UserSpecs WHERE UsernameLogin ='" + username + "'");

        try {

            if (rs.next()) {
                if (rs.getString("loginType").equals(loginType)) {
                    return true;

                }
                System.out.println("loginType answer" + let_in);
            }
        } catch (SQLException ex) {
            System.out.println("Error with result set:" + ex);
        }

        return let_in;
    }

    public boolean isAvailable(String color) {
        boolean Available = false;

        if (color.equals("-fx-background-color: #01579B;")) {
            return true;
        } else {
            return false;
        }
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        System.out.println("In classs: " + username);
        this.username = username;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        SQLBackend.count = count;
    }

    public void setUsertype(String usertype) {
        this.usertype = usertype;
        System.out.println("Usertype set to " + usertype);
    }

    public String getUsertype() {
        return usertype;
    }

    public String ticketPriceCheck(String productionName) {

        ResultSet qt = getResults("SELECT ticketPrice FROM ProductionSpecs WHERE productionName ='" + productionName + "'");
        String value = "";
        try {
            if (qt.next()) {
                value = qt.getString("ticketPrice");
                return value;

            } else {
                System.out.println("ticketPrice amount found");
            }
        } catch (SQLException ex) {
            System.out.println("Error with result set:" + ex);
        }
        return value;
    }

    public String getProductionName() {
        return productionName;
    }

    public void setProductionName(String productionName) {
        SQLBackend.productionName = productionName;
    }

   
    public String getSeatLetter() {
        return seatLetter;
    }

    public void setSeatLetter(String seatLetter) {
        SQLBackend.seatLetter = seatLetter;

    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        SQLBackend.seatNumber = seatNumber;
    }

    public String updateSeating() {
        String seat = this.getSeatLetter() + this.getSeatNumber();

        System.out.println("UPDATE SeatingTable SET Available = False, UserID = '"+this.getUsername()+"' WHERE Production ='" + this.getProductionName() + "' AND seatLetter = '" + this.getSeatLetter() + "' AND seatNumber = " + this.getSeatNumber() + "");
        Update("UPDATE SeatingTable SET Available = False WHERE Production ='" + this.getProductionName() + "' AND seatLetter = '" + this.getSeatLetter() + "' AND seatNumber = " + this.getSeatNumber() + "");
       //Update( "UPDATE SeatingTable SET Available = False, UserID = '"+this.getUsername()+"' WHERE Production ='" + this.getProductionName() + "' AND seatLetter = '" + this.getSeatLetter() + "' AND seatNumber = " + this.getSeatNumber() + "");
        System.out.println("seat updated " + seat);

        return null;
    }

   public boolean IsSeatAvailable(String seat) { //used to changed GUI Colour for next user, if colour is changed previous methods prevent it from being clicked
                                                   //not working because i cant view my databade and i think all seats have been updated to not available
        Boolean available = false ;
         seat = this.getSeatLetter() + this.getSeatNumber();
        
        ResultSet qt = getResults("SELECT Available FROM SeatingTable WHERE Production ='" + this.getProductionName() + "' AND seatLetter = '" + this.getSeatLetter() + "' AND seatNumber = " + this.getSeatNumber() + "");

       // System.out.println ("SELECT Available FROM SeatingTable WHERE Production ='" + this.getProductionName() + "' AND seatLetter = '" + this.getSeatLetter() + "' AND seatNumber = " + this.getSeatNumber() + "");
        try {
            if (qt.next()) {
               if(available = qt.getBoolean("Available")){
               System.out.println("availability found" + available);
               
               return available;
              
               }

            }  else {
                System.out.println("availability found:" + available);
                available = true;
                return available;
            }
        } catch (SQLException ex) {
            System.out.println("Error with result set:" + ex);
        }
        System.out.println(available);
        return available;
    }
       public String makeUnAvailable(String bookersname,String Production, String seat) {
        

        System.out.println("UPDATE SeatingTable SET Available = False AND UserID = '"+bookersname+"' WHERE Production ='" + Production + "' AND seatLetter = '" + seat.charAt(0) + "' AND seatNumber = " + seat.charAt(1) + "");
        Update("UPDATE SeatingTable SET Available = False AND UserID = '"+bookersname+"' WHERE Production ='" + Production + "' AND seatLetter = '" + seat.charAt(0) + "' AND seatNumber = " + seat.charAt(1) + "");

        System.out.println("seat updated " + seat);

        return null;
    }
       public String makeAvailable(String Production, String seat) {
        

        System.out.println("UPDATE SeatingTable SET Available = TRUE WHERE Production ='" + Production + "' AND seatLetter = '" + seat.charAt(0) + "' AND seatNumber = " + seat.charAt(1) + "");
        Update("UPDATE SeatingTable SET Available = TRUE WHERE Production ='" + Production + "' AND seatLetter = '" + seat.charAt(0) + "' AND seatNumber = " + seat.charAt(1) + "");

        System.out.println("seat updated " + seat);
        
        return null;
    }
       public String tooltipName(String Production){ //getsb name that displayed on admin page when vursor hovers over seat
       
        ResultSet qt = getResults("SELECT UserID FROM SeatingTable WHERE Production ='" + Production + "' AND seatLetter = '" + this.getSeatLetter() + "' AND seatNumber = " + this.getSeatNumber() + "");
        String value = "";
        try {
            if (qt.next()) {
                value = qt.getString("UserID");
                return value;

            } else {
                System.out.println("UserID amount found");
            }
        } catch (SQLException ex) {
            System.out.println("Error with result set:" + ex);
        }
        return value;
       }
}

