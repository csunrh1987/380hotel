import java.sql.*;

public class Database {

    public static void main(String[] args) throws SQLException {

        //im working on moving database to cloud, right now it's only local on my computer
        final String dbURL = "jdbc:mysql://127.0.0.1:3306/hotel_db";
        final String dbUsername = "root";
        final String dbPassword = "JavaDrinkers380";

        String query /*= put query here*/;

        try {
            Connection connection = DriverManager.getConnection(dbURL,dbUsername,dbPassword);
            Statement statement = connection.createStatement();
            ResultSet result /*= statement.executeQuery(query)*/;

            statement.close();
            connection.close();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
