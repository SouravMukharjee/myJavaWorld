/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package projectbankdb;

import java.sql.*;
/*import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.DriverManager;*/

public class DatabaseConnect
{

        private String sql;
        private Connection connection;
        private Statement stmt;
        private ResultSet rs;


        public DatabaseConnect(String name,String user,String pass)
        {
			String username=user;
			String password=pass;
			String url="jdbc:odbc:"+name;
			try
			{
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
				this.connection=DriverManager.getConnection(url);
				System.out.print("Connected\n");
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
	  }

        private void setSqlString(String query)
        {
                sql = query;
        }

        public int updateDB(String query)
        {
                setSqlString(query);
                int result = 0;
                try
                {
                        stmt=this.connection.createStatement();
                        result=this.stmt.executeUpdate(sql);
                }
                catch (Exception e)
                {
                        result=-1;
                        System.out.println("In updateDB " + e.toString());
                }
                return result;
        }

        public ResultSet searchDB(String query)
        {

                setSqlString(query);
                try
                {
                        stmt=connection.createStatement();
                        rs=stmt.executeQuery(sql);
                }
                catch (Exception e)
                {

                        System.out.println("In searchDB " + e.toString());
                }
                return rs;
        }


        public void close()
        {
                try
                {
                        connection.close();
                        System.out.println("Disconnected");
                }
                catch(Exception e)
                {
                        System.out.println(e+"Error");
                }

        }

}




