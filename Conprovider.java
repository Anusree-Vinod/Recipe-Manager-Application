/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import java.sql.*;
/**
 *
 * @author anusr
 */
public class Conprovider {
    public static Connection getCon(){
        try{
          Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","hr","123456Th#");
	return con;
        }
        catch(Exception e)
        {
            return null;
        }
    }
}
