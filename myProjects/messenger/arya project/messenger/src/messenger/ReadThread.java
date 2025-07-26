/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package messenger;

/**
 *
 * @author Sourar
 */
public class ReadThread {

    private Thread thr;
	private NetworkUtil nc;
	public String t;

	public ReadThread(NetworkUtil nc)
	{
		this.nc = nc;
		this.thr = new Thread();
		thr.start();
	}

	public void run()
	{

		try
		{

			while(true)
			{


                                   t=nc.read().toString();
                                   if(!t.isEmpty())
                                  // i.getmessage(t);

                                   System.out.println(t);

			}
		}catch(Exception e)
		{
			System.out.println (e);
		}
                nc.closeConnection();

	}
}
