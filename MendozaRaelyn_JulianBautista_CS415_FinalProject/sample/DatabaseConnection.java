package sample;

import java.sql.*;
public class DatabaseConnection {
    public Connection databaseLink;

    public Connection getConnection(){
        try{
            //create a connection with your database
            databaseLink = DriverManager.getConnection("jdbc:mysql://localhost:3306/BookTracker", "root", "kenji2023");

        }catch(Exception e){
            System.out.println(e);
        }

        return databaseLink;
    }
}
