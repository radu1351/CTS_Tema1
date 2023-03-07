package ro.ase.acs.cts.interfaces;

import java.sql.Connection;

public interface ConnectionManager {
    public Connection openConnection() throws Exception;
}
