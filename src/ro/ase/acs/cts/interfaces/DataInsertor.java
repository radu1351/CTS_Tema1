package ro.ase.acs.cts.interfaces;

import java.sql.Connection;

public interface DataInsertor {
    public void inserData(Connection connection) throws Exception;
}
