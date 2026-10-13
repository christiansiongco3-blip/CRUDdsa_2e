/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crud;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author jektong
 */
public class MsConnectAccess {
    private static final String URL =
        "jdbc:ucanaccess://C://Users//CL2-PC//Downloads//CRUDACCESSFILE-main//CRUDACCESSFILE-main//CRUD1.accdb";

    public static Connection getConnection() throws SQLException {

        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
        } catch (ClassNotFoundException e) {
            throw new SQLException("UCanAccess driver not found.", e);
        }

        return DriverManager.getConnection(URL);
    }

    public static void main(String[] args) {

        try {
            Connection conn = getConnection();

            System.out.println("DATABASE CONNECTED!");

            conn.close();

        } catch (SQLException e) {
            System.out.println("DATABASE CONNECTION FAILED!");
            e.printStackTrace();
        }
    }
}

