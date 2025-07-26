package massengerbyme;
import java.sql.*;




public class DatabaseTest
{
	DatabaseConnect dbc;
	

public	DatabaseTest(String s)
	{
		try
		{
			dbc=new DatabaseConnect("Driver={Microsoft Access Driver (*.mdb)};DBQ="+s+";DriverID=22;READONLY=true","","");
	
		}catch(Exception e)
		{
			System.out.println (e);
		}	
		
	}
	
	
	

	
}
	
