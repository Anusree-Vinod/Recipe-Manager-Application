/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import model.user;
import javax.swing.JOptionPane;
import java.sql.*;

/**
 *
 * @author anusr
 */
public class Userdao {
    public static void save(user User)
    {
        String query="insert into admin(id,name,email,password,status) values('"+User.getId()+"','"+User.getName()+"','"+User.getEmail()+"','"+User.getPwd()+"','true')";
        DbOperations.setDataOrDelete(query, "Registered Successfully");
    }
    public static user login(String name,String password)
    {
        user User=null;
        try{
            ResultSet rs=DbOperations.getData("select * from admin where name='"+name+"' and password='"+password+"'");
            while(rs.next())
            {
                User=new user();
                User.setStatus(rs.getString("status"));
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        return User;
    }
    
    public static user forgot(String name)
    {
      user User=null;
      try
      {
          ResultSet rs= DbOperations.getData("select * from admin where name='"+name+"'");
          while(rs.next())
          {
               User=new user();
              User.setEmail(rs.getString("email"));
              User.setPwd(rs.getString("password"));
          }
      }catch (Exception e)
      {
          JOptionPane.showMessageDialog(null,e);
      }
      return User;
    }
    public static void update(String email,String npwd)
    {
        String query="update admin set password='"+npwd+"' where email='"+email+"'";
        DbOperations.setDataOrDelete(query, "Updated Successfully");
    }
}
