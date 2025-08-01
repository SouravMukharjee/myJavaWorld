/*
 * ProjectDemoView.java
 */

package projectdemo;
import java.sql.*;
import org.jdesktop.application.Action;
import org.jdesktop.application.ResourceMap;
import org.jdesktop.application.SingleFrameApplication;
import org.jdesktop.application.FrameView;
import org.jdesktop.application.TaskMonitor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
import javax.swing.Icon;
import javax.swing.JDialog;
import javax.swing.JFrame;

/**
 * The application's main frame.
 */
public class ProjectDemoView extends FrameView {

    public ProjectDemoView(SingleFrameApplication app) {
        super(app);

        initComponents();

        // status bar initialization - message timeout, idle icon and busy animation, etc
        ResourceMap resourceMap = getResourceMap();
        int messageTimeout = resourceMap.getInteger("StatusBar.messageTimeout");
        messageTimer = new Timer(messageTimeout, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               // statusMessageLabel.setText("");
            }
        });
        messageTimer.setRepeats(false);
        int busyAnimationRate = resourceMap.getInteger("StatusBar.busyAnimationRate");
        for (int i = 0; i < busyIcons.length; i++) {
            busyIcons[i] = resourceMap.getIcon("StatusBar.busyIcons[" + i + "]");
        }
        busyIconTimer = new Timer(busyAnimationRate, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                busyIconIndex = (busyIconIndex + 1) % busyIcons.length;
              //  statusAnimationLabel.setIcon(busyIcons[busyIconIndex]);
            }
        });
        idleIcon = resourceMap.getIcon("StatusBar.idleIcon");
       // statusAnimationLabel.setIcon(idleIcon);
       // progressBar.setVisible(false);

        // connecting action tasks to status bar via TaskMonitor
        TaskMonitor taskMonitor = new TaskMonitor(getApplication().getContext());
        taskMonitor.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                String propertyName = evt.getPropertyName();
                if ("started".equals(propertyName)) {
                    if (!busyIconTimer.isRunning()) {
                      //  statusAnimationLabel.setIcon(busyIcons[0]);
                        busyIconIndex = 0;
                        busyIconTimer.start();
                    }
                   // progressBar.setVisible(true);
                   // progressBar.setIndeterminate(true);
                } else if ("done".equals(propertyName)) {
                    busyIconTimer.stop();
                   // statusAnimationLabel.setIcon(idleIcon);
                   // progressBar.setVisible(false);
                   // progressBar.setValue(0);
                } else if ("message".equals(propertyName)) {
                    String text = (String)(evt.getNewValue());
                   // statusMessageLabel.setText((text == null) ? "" : text);
                    messageTimer.restart();
                } else if ("progress".equals(propertyName)) {
                    int value = (Integer)(evt.getNewValue());
                   // progressBar.setVisible(true);
                   // progressBar.setIndeterminate(false);
                   // progressBar.setValue(value);
                }
            }
        });
    }

    @Action
    public void showAboutBox() {
        if (aboutBox == null) {
            JFrame mainFrame = ProjectDemoApp.getApplication().getMainFrame();
            aboutBox = new ProjectDemoAboutBox(mainFrame);
            aboutBox.setLocationRelativeTo(mainFrame);
        }
        ProjectDemoApp.getApplication().show(aboutBox);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(projectdemo.ProjectDemoApp.class).getContext().getResourceMap(ProjectDemoView.class);
        mainPanel.setBackground(resourceMap.getColor("mainPanel.background")); // NOI18N
        mainPanel.setName("mainPanel"); // NOI18N
        mainPanel.setLayout(null);

        jLabel1.setFont(resourceMap.getFont("jLabel1.font")); // NOI18N
        jLabel1.setText(resourceMap.getString("jLabel1.text")); // NOI18N
        jLabel1.setName("jLabel1"); // NOI18N
        mainPanel.add(jLabel1);
        jLabel1.setBounds(20, 80, 90, 25);

        jLabel2.setFont(resourceMap.getFont("jLabel2.font")); // NOI18N
        jLabel2.setText(resourceMap.getString("jLabel2.text")); // NOI18N
        jLabel2.setName("jLabel2"); // NOI18N
        mainPanel.add(jLabel2);
        jLabel2.setBounds(20, 130, 90, 31);

        jTextField1.setFont(resourceMap.getFont("jTextField1.font")); // NOI18N
        jTextField1.setText(resourceMap.getString("jTextField1.text")); // NOI18N
        jTextField1.setName("jTextField1"); // NOI18N
        mainPanel.add(jTextField1);
        jTextField1.setBounds(100, 80, 159, 30);

        jPasswordField1.setFont(resourceMap.getFont("jPasswordField1.font")); // NOI18N
        jPasswordField1.setText(resourceMap.getString("jPasswordField1.text")); // NOI18N
        jPasswordField1.setName("jPasswordField1"); // NOI18N
        mainPanel.add(jPasswordField1);
        jPasswordField1.setBounds(100, 130, 159, 30);

        jButton1.setText(resourceMap.getString("jButton1.text")); // NOI18N
        jButton1.setName("jButton1"); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        mainPanel.add(jButton1);
        jButton1.setBounds(150, 200, 80, 23);

        jButton2.setText(resourceMap.getString("jButton2.text")); // NOI18N
        jButton2.setName("jButton2"); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        mainPanel.add(jButton2);
        jButton2.setBounds(240, 200, 70, 23);

        jButton3.setText(resourceMap.getString("jButton3.text")); // NOI18N
        jButton3.setName("jButton3"); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        mainPanel.add(jButton3);
        jButton3.setBounds(150, 230, 160, 23);

        jLabel3.setFont(resourceMap.getFont("jLabel3.font")); // NOI18N
        jLabel3.setText(resourceMap.getString("jLabel3.text")); // NOI18N
        jLabel3.setName("jLabel3"); // NOI18N
        mainPanel.add(jLabel3);
        jLabel3.setBounds(10, 20, 320, 22);

        setComponent(mainPanel);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //ProjectDemoApp.getApplication().getMainFrame().setVisible(false);
          NID = jTextField1.getText();
          password = jPasswordField1.getText();
          try{
          ResultSet rs=dt.dbc.searchDB("select * from sdb");
          int flag =0;
          
          while(rs.next())
          {
    
             if(jTextField1.getText().equals("") && jPasswordField1.getText().equals(""))
             {
                 jp.showMessageDialog(jf,"Enter NID and Password");
             }

            else if(jTextField1.getText().equals(""))
                 {
                     jp.showMessageDialog(jf,"input NID !");
                 }

            else if  (true)
                 {
                     if  (rs.getString("NID").equals(NID))
                         {
                             flag++;
                         }
                     else
                         {
                             jp.showMessageDialog(jf, "Incorrect NID !");
                         }
                 }
                  

              
             if(jTextField1.getText().equals("") && jPasswordField1.getText().equals(""))
             {
               
             }
             else
                 {
                    if (rs.getString("Password").equals(password))
                              {
                                   flag++;
                              }
                     else {
                            if(jPasswordField1.getText().equals(""))
                                {
                                      jp.showMessageDialog(jf,"input password !");
                                }
                            else
                                {
                                      jp.showMessageDialog(jf, "Incorrect Password !");
                                }
                          }
                  
                  }
               
              if(flag==2){
                   jp.showMessageDialog(jf, "login Successful");
                   ProjectDemoApp.getApplication().getMainFrame().setVisible(false);
                   Showinformation show=new Showinformation(dt,this);
                   show.setVisible(true);
                }
              break;
              }
          rs.close();
          }
          catch(Exception e){
              System.out.println("problem");
          }


          // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       ProjectDemoApp.getApplication().getMainFrame().setVisible(false);
       Register r= new Register(dt);
       r.setVisible(true);
       // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    Forgetpassword fp=new Forgetpassword(dt);
    fp.setVisible(true);
    ProjectDemoApp.getApplication().getMainFrame().setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed
    public DatabaseTest dt=new DatabaseTest("studentdb.mdb");
    public String NID=new String();
    public String password=new String();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPanel mainPanel;
    // End of variables declaration//GEN-END:variables
    public javax.swing.JOptionPane jp;
    public javax.swing.JFrame jf;
    private final Timer messageTimer;
    private final Timer busyIconTimer;
    private final Icon idleIcon;
    private final Icon[] busyIcons = new Icon[15];
    private int busyIconIndex = 0;

    private JDialog aboutBox;
}
