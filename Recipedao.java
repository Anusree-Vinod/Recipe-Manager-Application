/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Recipe;
import java.sql.*;
/**
 *
 * @author anusr
 */
public class Recipedao {
    public static void save(Recipe recipe)
    {
        String query="insert into recipe(recid,title,disc,preptime,ctime,id)values('"+recipe.getRecid()+"','"+recipe.getTitle()+"','"+recipe.getDisc()+"','"+recipe.getPreptime()+"','"+recipe.getCtime()+"','"+recipe.getId()+"')";
        DbOperations.setDataOrDelete(query,"Recipe added successfully");
    }
    public static ArrayList<Recipe> getAllRecords()
    {
        ArrayList<Recipe> arrayList = new ArrayList<>();
        try
        {
         ResultSet rs= DbOperations.getData("select * from recipe");
         while(rs.next())
         {
             Recipe r= new Recipe();
             r.setRecid(rs.getString("recid"));
             r.setTitle(rs.getString("title"));
             r.setId(rs.getString("id"));
             r.setPreptime(rs.getString("preptime"));
             r.setCtime(rs.getString("ctime"));
             r.setDisc(rs.getString("disc"));
             arrayList.add(r);
         }
        }catch(Exception e)
        {
          JOptionPane.showMessageDialog(null,e);   
        }
        return arrayList;
    }
    public static void update(Recipe r)
    {
        String query="update recipe set title='"+r.getTitle()+"',disc='"+r.getDisc()+"',preptime='"+r.getPreptime()+"',ctime='"+r.getCtime()+"',id='"+r.getId()+"' where recid='"+r.getRecid()+"'";
        DbOperations.setDataOrDelete(query, "Recipe Updated Successfully");
    }
    public static void delete(String rid)
    {
        String query="delete from recipe where recid='"+rid+"'";
        DbOperations.setDataOrDelete(query, "Recipe Deleted Successfully");
    }    
}
