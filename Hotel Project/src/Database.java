import javax.swing.plaf.nimbus.State;
import java.sql.*;

public class Database {

        static Connection connection = null;
        // still trying to get this to connect, will do soon
        static String dbURL = "jdbc:mysql://remotemysql.com:3306/fuvZhYQMTx";
        static String dbUsername = "fuvZhYQMTx";
        static String dbPassword = "8mfkFc55Ct";

        String query = "SELECT test_name FROM test";

        public static Connection getConnection(){
            if (connection == null) {
                try {
                    connection = DriverManager.getConnection(dbURL, dbUsername, dbPassword);

                    if (connection != null) {
                        System.out.println("Successfully connected to database");
                    }
                } catch (SQLException ex) {
                    System.out.println("SQLException: " + ex.getMessage());
                    System.out.println("SQLState: " + ex.getSQLState());
                    System.out.println("VendorError: " + ex.getErrorCode());
                }
            }

            return connection;
        }

        public Connection getConnector() {
            if (connection == null) {
                try {
                    connection = DriverManager.getConnection(dbURL, dbUsername, dbPassword);

                    if (connection != null) {
                        System.out.println("Successfully connected to database");
                    }
                } catch (SQLException ex) {
                    System.out.println("SQLException: " + ex.getMessage());
                    System.out.println("SQLState: " + ex.getSQLState());
                    System.out.println("VendorError: " + ex.getErrorCode());
                }
            }
            return connection;
        }

        public static ResultSet getResultSet(String sql) throws SQLException {
            Connection myConnection = Database.getConnection();
            Statement statement = myConnection.createStatement();
            return statement.executeQuery(sql);
        }
}
