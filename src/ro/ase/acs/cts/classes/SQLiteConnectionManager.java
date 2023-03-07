package ro.ase.acs.cts.classes;

import ro.ase.acs.cts.interfaces.ConnectionManager;

import java.sql.Connection;
import java.sql.DriverManager;

public class SQLiteConnectionManager implements ConnectionManager {
    @Override
    public Connection openConnection() throws Exception{
        Class.forName("org.sqlite.JDBC");
        Connection connection = DriverManager.getConnection("jdbc:sqlite:database.db");
        connection.setAutoCommit(false);
        return connection;
    }
}
