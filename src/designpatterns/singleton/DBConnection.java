package designpatterns.singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    private Connection con;
    private static DBConnection dbCon;

    private DBConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.driver");
        con = DriverManager.getConnection("host", "user", "password");
    }

    public static DBConnection getInstance() throws SQLException, ClassNotFoundException {
        if (dbCon == null){
            dbCon = new DBConnection();
        }
        return dbCon;
    }

    public Connection getConnection(){
        return con;
    }
}
