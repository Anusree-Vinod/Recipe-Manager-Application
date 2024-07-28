/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import javax.swing.JOptionPane;
import java.sql.*;
/**
 *
 * @author anusr
 */
public class Dbop {
    public static void setdataOrDelete(String Query,String msg)
    {
        try{
           Connection con=Conprovider.getCon();
           Statement st=con.createStatement();
           st.executeUpdate(Query);
           if(!msg.equals(""))
               JOptionPane.showMessageDialog(null,msg);
        }
        catch(Exception e)
                {
                    JOptionPane.showMessageDialog(null,e,"Message",JOptionPane.ERROR_MESSAGE);
                }
    }
}
