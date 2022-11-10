import java.sql.*;

public class Database {

    public static void main(String[] args) throws SQLException {

        // still trying to get this to connect, will do soon
        final String dbURL = "jdbc:mysql://34.94.145.205:mythic-groove-368204:us-west2:java-drinkers-hotel-380/hotel_db?";
        final String dbUsername = "java";
        final String dbPassword = "JavaDrinkers380";

        String query = "SELECT test_name FROM test";

        try {
            Connection connection = DriverManager.getConnection(dbURL,dbUsername,dbPassword);
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery(query);

            statement.close();
            connection.close();

            System.out.println(result);
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
