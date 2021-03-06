package com.devdaily.sqlprocessortests;

import java.sql.*;
import java.util.Scanner;


public class database {
    

    static final String DB_URL = "jdbc:mysql://localhost:3306/student";
    static final String DRIVER = "com.mysql.jdbc.driver";

    static final String USER = "root";
    static final String PASS = "mobius365";
    private static Object st1;
     
    public static void main(String[] args) {
        Connection conn = null;
        // while(true) used for an infinite loop
        while(true){
            //to get an input from the user based on switch case
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter your choice: ");
        System.out.println("1.select\n2.update\n3.delete\n4.insert\n5.database\n6.exit\n");
        int ch=0;
        ch = input.nextInt();
           //switch case     
        switch (ch) 
        {
           
            
            case 1: {
                try {
                    //the driver to connect for the database
                    Class.forName("com.mysql.jdbc.Driver");
                    conn = DriverManager.getConnection(DB_URL, USER, PASS);
                    Statement st1 = conn.createStatement();
                    //Query to excute
                    String sql = "select * from students";
                    ResultSet rs ;
                    rs=st1.executeQuery(sql);
                    // geting the mail,first_name and last_name from the database
                    while (rs.next()) {
                      
                        String mail = rs.getString("mail");
                        String nam = rs.getString("last_name");
                        int ag = rs.getInt("first_name");
                        System.out.println(mail);
                        System.out.println(nam);
                        System.out.println(ag);
                        System.out.println("Above are the selected rows");
                    }
                    
                
                   

                      //printing statement
                    System.out.println("\nselected");

                } catch (SQLException se) {
                    se.printStackTrace();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                // break to stop this case 1
                break;
              }
            case 2: {
                try {

                    Class.forName("com.mysql.jdbc.Driver");
                    conn = DriverManager.getConnection(DB_URL, USER, PASS);
                     Statement st11=conn.createStatement();
                    System.out.println("database connected");
                    Scanner intt=new Scanner(System.in);
                    System.out.println("enter the row to be updated");
                    String mail=intt.nextLine();
                    System.out.println("enter the last_name");
                    String last_name=intt.nextLine();
                    String query = "update students set mail=? where last_name=? ";
                    PreparedStatement ps = conn.prepareStatement(query);
                    ps.setString(1, mail);
                    ps.setString(2,last_name);
                    ps.executeUpdate();
                        String sql = "select * from students";
                    ResultSet qs ;
                    qs=st11.executeQuery(sql);
                    while (qs.next()) {
                        String mail1= qs.getString("mail");
                        String nam = qs.getString("last_name");
                        int ag = qs.getInt("first_name");
                        System.out.println(mail1);
                        System.out.println(nam);
                        System.out.println(ag);
                    }
                    System.out.println("updated successfully");
                   
                   

                   

                    conn.close();
                } catch (SQLException se) {
                    se.printStackTrace();
                } catch (Exception e) {
                    e.printStackTrace();
                }
               break;
            }

            case 3: {
                try {

                    Class.forName("com.mysql.jdbc.Driver");
                    conn = DriverManager.getConnection(DB_URL, USER, PASS);
                    Statement st11 = conn.createStatement();
                      System.out.println("database connected");
                    System.out.println("deleting....");
                    Scanner inn=new Scanner(System.in);
                    System.out.println("enter the row to be deleted");
                    String mail=inn.nextLine();
                    String query = "delete from students where mail = ?";
                    PreparedStatement preparedStmt = conn.prepareStatement(query);
                    preparedStmt.setString(1, mail);
        
                    preparedStmt.execute();
                        String sql = "select * from students";
                    ResultSet qms ;
                    qms=st11.executeQuery(sql);
                    while (qms.next()) {
                        String mail1= qms.getString("mail");
                        String nam = qms.getString("last_name");
                        int ag = qms.getInt("first_name");
                        System.out.println(mail1);
                        System.out.println(nam);
                        System.out.println(ag);
                    }

                    System.out.println("\ndeleted");
                    conn.close();
                } catch (SQLException se) {
                    se.printStackTrace();
                } catch (Exception e) {
                    e.printStackTrace();
                
            }
                break;
            }

            case 4: {
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    conn = DriverManager.getConnection(DB_URL, USER, PASS);
                    Statement st11 = conn.createStatement();
                    System.out.println("inserting into tables");
                    Scanner intt=new Scanner(System.in);
                  
               
                    System.out.println("Enter the mailid");
                    String mail=intt.nextLine();
                    System.out.println("Enter the last name");
                    String last_name=intt.nextLine();
                    System.out.println("enter the first-name");
                    int first_name=intt.nextInt();

                    String sql1 = "insert into students" + "(mail,last_name,first_name) values(?,?,?)";
                    PreparedStatement ps=conn.prepareStatement(sql1);
                    ps.setString(1,mail);
                    ps.setString(2,last_name);
                    ps.setInt(3,first_name);
                    
                    
                    
                    ps.executeUpdate();
                    String sql = "select * from students";
                    ResultSet rs ;
                    rs=st11.executeQuery(sql);
                    while (rs.next()) {
                        String mail1 = rs.getString("mail");
                        String nam1 = rs.getString("last_name");
                        int ag1 = rs.getInt("first_name");
                        System.out.println(mail1);
                        System.out.println(nam1);
                        System.out.println(ag1);
                    }
                   

                    System.out.println("\ninserted successfully");
                    conn.close();

                } catch (SQLException se) {
                    se.printStackTrace();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            }
            case 5: {
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    conn = DriverManager.getConnection(DB_URL, USER, PASS);
                    Statement st11 = conn.createStatement();
                    System.out.println("database connected");
                    String st2 = "create database employee";
                    st11.executeUpdate(st2);
                    conn.close();
                } catch (SQLException se) {
                    se.printStackTrace();
                } catch (Exception e) {
                    e.printStackTrace();
                }
             break;
            }
           
            default:
                System.out.println("exit");
                
               
        }
    }
}
}
