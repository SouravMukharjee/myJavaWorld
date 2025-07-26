/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package projectbankdb;

import java.sql.*;




public class DatabaseTest
{
	DatabaseConnect dbc;


public	DatabaseTest(String s)
	{
		try
		{
			dbc=new DatabaseConnect("Driver={Microsoft Access Driver (*.mdb)};DBQ="+s+";DriverID=22;READONLY=true","","");

			// Select

		/*	ResultSet rs=dbc.searchDB("select * from asif");
			String test="23";
			String query="Insert into asif values('"+test+"','127.0.0.123','xerox','784')";
			dbc.updateDB(query);
			*/
		      // ResultSet rs=dbc.searchDB("select password from studentdb where student_id='0705103'");
			//dbc.updateDB("Insert into studentdb values('"+"4"+"','xyz','102030')");
                      //  dbc.updateDB("delete from studentdb where student_id='11101012'");

                     //   ResultSet rs=dbc.searchDB("select * from studentdb");
                //        while(rs.next())
///			{
//				System.out.println("Student ID: "+rs.getString("student_id"));
//				System.out.println("Password: "+rs.getString("password"));
//			}

			// Update
		//	String test="15";
		//	String query="Insert into asif values('"+test+"','127.0.0.2','shagufta','123456')";
		//	dbc.updateDB(query);
		//	String query="Update asif set password='7891236' where name='asif'";
		//	dbc.updateDB(query);
		/*	String newSelected="name";
			String query="update asif set selected='"+newSelected+"' where selected='serial'";
			dbc.updateDB(query);
	*/
			// Delete
	/*	String query="delete from asif where name='xerox'";
			dbc.updateDB(query);
				dbc.updateDB(query);
				dbc.updateDB(query);
				dbc.updateDB(query);
	*/
			// Insert (same as update or delete, write the query and dbc.updateDB(query))







		}catch(Exception e)
		{
			System.out.println (e);
		}

	}





}

