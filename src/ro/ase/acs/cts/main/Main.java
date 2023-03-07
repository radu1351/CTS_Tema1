package ro.ase.acs.cts.main;

import ro.ase.acs.cts.classes.EmployeeDataInsertor;
import ro.ase.acs.cts.classes.EmployeeReader;
import ro.ase.acs.cts.classes.EmployeeTableCreator;
import ro.ase.acs.cts.classes.SQLiteConnectionManager;
import ro.ase.acs.cts.interfaces.DataInsertor;
import ro.ase.acs.cts.interfaces.DataReader;
import ro.ase.acs.cts.interfaces.TableCreator;


import java.sql.Connection;
import java.sql.DriverManager;


public class Main {

    public static void main(String[] args) {
        try {
            SQLiteConnectionManager sqLiteConnectionManager = new SQLiteConnectionManager();
            Connection connection = sqLiteConnectionManager.openConnection();

            TableCreator employeeTableCreator = new EmployeeTableCreator();
            employeeTableCreator.createTable(connection);

            DataInsertor employeeDataInsertor = new EmployeeDataInsertor();
            employeeDataInsertor.inserData(connection);

            DataReader employeeReader = new EmployeeReader();
            employeeReader.readData(connection);

            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}