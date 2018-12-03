
package com.beans;

import java.sql.Connection;
import java.sql.SQLException;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import org.apache.derby.jdbc.ClientDataSource;


public class Connector {

    public Connection createConnection() throws NamingException , SQLException{
        
       ClientDataSource dc = new ClientDataSource();
       dc.setServerName("LocalHost");
       dc.setUser("madan");
       dc.setPassword("madan");
       dc.setPortNumber(1527);
       dc.setDatabaseName("ExoticaDB");
       Context ctx = new InitialContext();
       ctx.rebind("jdbc/mydb", dc);
       DataSource ds = (DataSource)ctx.lookup("jdbc/mydb");
       Connection con = ds.getConnection();
       return con;
    }
    
}
