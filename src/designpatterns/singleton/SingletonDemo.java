package designpatterns.singleton;

import java.sql.Connection;
import java.sql.SQLException;

public class SingletonDemo {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        DBConnection instance = DBConnection.getInstance();
        Connection connection = instance.getConnection();
        System.out.println(connection);
    }
}
