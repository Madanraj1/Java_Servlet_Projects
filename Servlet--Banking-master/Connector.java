
package maddy;

import java.sql.Connection;
import java.sql.SQLException;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import org.apache.derby.jdbc.ClientDataSource;


public class Connector {
   
       
    public Connection createConnection() throws NamingException , SQLException {
        ClientDataSource dc = new org.apache.derby.jdbc.ClientDataSource();
        dc.setServerName("localhost");
        dc.setUser("madan");
        dc.setPassword("madan");
        dc.setPortNumber(1527);
        dc.setDatabaseName("Banking");
        Context ctx = new InitialContext();
        ctx.rebind("jdbc/MyDB", dc);
        DataSource ds = (DataSource)ctx.lookup("jdbc/MyDB");
        Connection con  = ds.getConnection();
        return con;
    }
}
