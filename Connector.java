import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connector {
    private static Connection connection;

    private Connector() {

    }

    public static Connection getConnection() {
        try {
            try {
                if (connection == null || connection.isClosed()) {
                    //Class.forName("com.mysql.jdbc.Driver");
                    connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/?serverTimezone=Europe/Amsterdam&amp", "root", "Johari");
                    //WILLIAMS DB
                   // connection = DriverManager.getConnection("jdbc:mysql://10.16.239.154:3306/?serverTimezone=Europe/Amsterdam&amp", "user1", "hest1");

                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            return connection;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}



