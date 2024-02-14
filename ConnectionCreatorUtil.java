package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionCreatorUtil {
    public Connection connecttoDatabase() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver Has Been Loaded");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/JukeBox", "root", "Ravi12345$");
            if (connection != null) {
                //System.out.println("ConnectionCreator Util Estabhlished");
            }

        } catch (ClassNotFoundException | SQLException exception) {
            exception.printStackTrace();
        }
        return connection;
    }
}
