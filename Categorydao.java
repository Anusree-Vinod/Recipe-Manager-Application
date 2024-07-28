/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import model.Category;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.sql.*;
/**
 *
 * @author anusr
 */
public class Categorydao {
   public static  ArrayList<Category> getAllRecords() 
   {
       ArrayList<Category> arraylist=new ArrayList();
       try
       {
         ResultSet rs=DbOperations.getData("select * from category");
         while(rs.next())
         {
             Category category=new Category();
             category.setId(rs.getString("id"));
             category.setName(rs.getString("name"));
             category.setDiscription(rs.getString("discription"));
             arraylist.add(category);
         }
       }catch(Exception e)
       {
         JOptionPane.showMessageDialog(null,e);  
       }
       return arraylist;
   }
   public static void save(Category cate)
    {
        String query="insert into category(id,name,discription)values('"+cate.getId()+"','"+cate.getName()+"','"+cate.getDiscription()+"')";
        DbOperations.setDataOrDelete(query,"Category added successfully");
    }
}
