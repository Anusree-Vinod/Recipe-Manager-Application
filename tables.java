/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import javax.swing.JOptionPane;
/**
 *
 * @author anusr
 */
public class tables {
     
   public static void main(String arg[])
   {
       try
       {
         
           
         //String userTable="create table admin(id varchar2(10) primary key,name varchar2(10),Email varchar2(20),password varchar2(10),status varchar2(10))";  
        //DbOperations.setDataOrDelete(userTable, "Admin table created successfully");
        String cattable="create table category(id varchar2(5) primary key,name varchar2(10),discription varchar2(100))";
        DbOperations.setDataOrDelete(cattable, "Catagory table created successfully");
           //String query="insert into category (id,name,discription) values('1','Breakfast','The first meal of the day, provides essential nourishment and energy to kickstart your morning.')";       
           //DbOperations.setDataOrDelete(query, "Values inserted successfully");
       //String query1="insert into category (id,name,discription) values('2','Lunch','Offers sustenance during the days activities, providing nourishment and energy to carry on.')";
       //DbOperations.setDataOrDelete(query1, "Values inserted successfully");
       //String query2="insert into category (id,name,discription) values('3','Dinner','Offers relaxation at the end of the day, fostering connection shared meals and cherished moments.')";
       //DbOperations.setDataOrDelete(query2, "Values inserted successfully");
       //String query3="insert into category (id,name,discription) values('4','Dessert','Brings a sweet conclusion to any meal, tantalizing taste buds with flavors and textures.')";
       //DbOperations.setDataOrDelete(query3, "Values inserted successfully");
        //String rectable="create table recipe(recid varchar2(10) primary key,title varchar2(10),disc varchar2(500),preptime varchar2(10),ctime varchar2(10),id references category(id))";   
        //DbOperations.setDataOrDelete(rectable, "Table created successfully");
        //String query4="insert into category (id,name,discription) values('5','Drinks','')";
       //DbOperations.setDataOrDelete(query4, "Values inserted successfully");
       }
       
       catch(Exception e)
       {
           JOptionPane.showMessageDialog(null,e);
       }
       
   }
}
