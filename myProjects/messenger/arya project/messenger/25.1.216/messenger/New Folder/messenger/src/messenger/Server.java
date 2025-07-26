

package messenger;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.UnknownHostException;
import java.net.Socket;
/**
 *
 * @author Sourar
 */
public class Server extends javax.swing.JFrame {

private ServerSocket ServSock;

	Server()
	{
		try
		{
		ServSock = new ServerSocket(33333);
		while (true)
		{
			ServerThread m = new ServerThread(ServSock.accept());
		}
		}catch(Exception e)
		{
			System.out.println("Server starts:"+e);
		}
	}

	public static void main(String args[]) 	throws UnknownHostException, IOException
	{
		Server objServer = new Server();
	}
}

 class ServerThread implements Runnable
 {
	private Socket ClientSock;
	private Thread thr;
	private NetworkUtil nc;

	ServerThread(Socket client)
	{
		this.ClientSock = client;
		this.thr = new Thread(this);
		thr.start();
	}

	public void run()
	{
		this.nc=new NetworkUtil(ClientSock);
		new ReadThread(this.nc);
		new WriteThread(this.nc,"Server");

	}

 
        /*

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("Form"); // NOI18N
        getContentPane().setLayout(null);

        jPanel1.setName("jPanel1"); // NOI18N

        jTextField1.setText("server"); // NOI18N
        jTextField1.setName("jTextField1"); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                .addGap(174, 174, 174))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(141, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(40, 30, 290, 200);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

}
