/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rifat
 */
package messenger;

public class Client
{
	public static void main(String args[])
	{
		try
		{
            String serverAddress="127.0.0.1";
            int serverPort=33333;
			NetworkUtil nc=new NetworkUtil(serverAddress,serverPort);
            ReadThread readThread = new ReadThread(nc);

            WriteThread writeThread = new WriteThread(nc, "Client");
		}catch(Exception e)
		{
			System.out.println (e);
		}
		
	}

}

