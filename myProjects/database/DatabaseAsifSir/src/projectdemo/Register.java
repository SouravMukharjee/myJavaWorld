/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Register.java
 *
 * Created on Dec 29, 2015, 12:02:09 PM
 */

package projectdemo;

/**
 *
 * @author lab1pc25
 */
public class Register extends javax.swing.JFrame {

    /** Creates new form Register */
    public Register(DatabaseTest dt) {
        this.dt = dt;
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(projectdemo.ProjectDemoApp.class).getContext().getResourceMap(Register.class);
        jLabel2.setText(resourceMap.getString("jLabel2.text")); // NOI18N
        jLabel2.setName("jLabel2"); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("Form"); // NOI18N
        getContentPane().setLayout(null);

        jLabel1.setText(resourceMap.getString("jLabel1.text")); // NOI18N
        jLabel1.setName("jLabel1"); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 20, 64, 14);

        jLabel3.setText(resourceMap.getString("jLabel3.text")); // NOI18N
        jLabel3.setName("jLabel3"); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 80, 64, 14);

        jLabel4.setText(resourceMap.getString("jLabel4.text")); // NOI18N
        jLabel4.setName("jLabel4"); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 140, 65, 10);

        jTextField1.setText(resourceMap.getString("jTextField1.text")); // NOI18N
        jTextField1.setName("jTextField1"); // NOI18N
        getContentPane().add(jTextField1);
        jTextField1.setBounds(119, 11, 207, 20);

        jTextField2.setText(resourceMap.getString("jTextField2.text")); // NOI18N
        jTextField2.setName("jTextField2"); // NOI18N
        getContentPane().add(jTextField2);
        jTextField2.setBounds(119, 72, 207, 20);

        jTextField3.setText(resourceMap.getString("jTextField3.text")); // NOI18N
        jTextField3.setName("jTextField3"); // NOI18N
        getContentPane().add(jTextField3);
        jTextField3.setBounds(119, 129, 207, 20);

        jButton1.setText(resourceMap.getString("jButton1.text")); // NOI18N
        jButton1.setName("jButton1"); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(261, 193, 65, 23);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       id = jTextField1.getText();
       username= jTextField2.getText();
       password = jTextField3.getText();
       dt.dbc.updateDB("insert into sdb values('"+id+"','"+username+"','"+password+"')");
       this.setVisible(false);
       ProjectDemoApp.getApplication().getMainFrame().setVisible(true);
       //dt.dbc.updateDB("update sdb set values NID='"+id+"',Username='"+username+"',Password='"+password+"'");
       // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed
    public String id=new String();
    public String username =new String();
    public String password = new String();
    public DatabaseTest dt;
    /**
    * @param args the command line arguments
    */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables

}
