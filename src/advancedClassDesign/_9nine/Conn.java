package advancedClassDesign._9nine;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Conn {

    public void stmt(Connection conn, int a) throws SQLException {
        Statement stmt = conn.createStatement(a, ResultSet.CONCUR_READ_ONLY);
    }
}
