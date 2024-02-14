package dao;

import util.ConnectionCreatorUtil;

import java.sql.*;

import java.util.Scanner;
import  java.sql.Connection;

public class PlaylistDao {

    public  boolean createPlayList()  {
        ConnectionCreatorUtil connectionCreatorUtil = new ConnectionCreatorUtil();
        Connection connection=connectionCreatorUtil.connecttoDatabase();

        System.out.println("Enter Id");
        Scanner scanner = new Scanner(System.in);
        int Id = scanner.nextInt();
        System.out.println("Enter Song Name");
       String Name = scanner.next();
        System.out.println("Enter Date like YYYY-MM-DD");
        String dateofCreation = scanner.next();
        try {
            Statement statement = connection.createStatement();
            statement.executeUpdate("insert into  Playlist1 values ("+Id+",'"+Name+"','"+dateofCreation+"');");
        }catch (SQLException exception){
            exception.printStackTrace();
        }
        return false;
    }



    }



