Home page 
Home page
import javax.swing.JoptionPane;

Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license

* Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/Jframe.java to edit this template

이

@author Lenovo

public class LOGINPAGE extends javax.swing.Jframe {

Creates new form LOGINPAGE
*/

public LOGINPAGE() {

initComponents();

}

/**

* This method is called from within the constructor to initialize the form.

* WARNING: Do NOT modify this code. The content of this method is always

* regenerated by the Form Editor.

*/

@SuppressWarnings("unchecked")

// <editor-fold defaultstate="collapsed" desc="Generated Code">

private void initComponents() {

jPanel1 = new javax.swing.Jpanel();

jLabell = new javax.swing.Jlabel();

jLabel2 = new javax.swing.Jlabel();

jTextField1 = new javax.swing.JtextField();

jLabel3 = new javax.swing.Jlabel();

jButton1 = new javax.swing.Jbutton();

jPasswordField1 = new javax.swing.JpasswordField();

jButton2= new javax.swing.Jbutton();

setDefaultCloseOperation(javax.swing. WindowConstants.EXIT_ON_CLOSE);

jPanell.setLayout(new org.netbeans.lib.awtextra. AbsoluteLayout());

jLabell.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N jLabell.setText("USERNAME");
jPanell.add(jLabell, new org.netbeans.lib.awtextra. AbsoluteConstraints(72, 71, 90,-1));

jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N jLabel2.setText("PASSWORD");

jPanell.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints (72, 129, 83,-1));

jPanell.add(jTextField1, new org.netbeans.lib.awtextra. Absolute Constraints(202, 71, 144, -1));

jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N jLabel3.setText("LOGIN PAGE");

jPanell.add(jLabel3, new org.netbeans.lib.awtextra. AbsoluteConstraints(129, 17, 123,-1));

jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NO118N jButton1.setText("LOGIN");

jButton1.addActionListener(new java.awt.event.ActionListener() {

public void actionPerformed(java.awt.event.ActionEvent evt) {

jButton1 ActionPerformed(evt);

}

});

jPanell.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 90,-1));

jPanell.add(jPasswordField1,new

org.netbeans.lib.awtextra. AbsoluteConstraints(210, 130, 130, -1));

jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

jButton2.setText("CLOSE");

jButton2.addActionListener(new java.awt.event.ActionListener() {
B. Sukumar C

D. Ajay Kumar

K. Hemanth (2

public void actionPerformed(java.awt.event.ActionEvent evt) {

jButton2ActionPerformed(evt);

}

});

jPanell.add(jButton2, new org.netbeans.lib.awtextra. AbsoluteConstraints (250, 200, -1, -1));

javax.swing.GroupLayout layout =new javax.swing.GroupLayout(getContentPane());

getContentPane().setLayout(layout);

layout.setHorizontal Group(

layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

.addGroup(javax.swing.GroupLayout.Alignment. TRAILING, layout.createSequential Group()

.addContainerGap()

.addComponent(jPanell, Javax.swing.GroupLayout.DEFAULT_SIZE, 389, Short.MAX_VALUE)

.addContainerGap())

);

layout.setVerticalGroup(

layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

.addGroup(layout.createSequentialGroup()

.addComponent(jPanell, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)

.addGap(0, 6, Short.MAX_VALUE))

);

pack();
}// </editor-fold>

private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {

// TODO add your handling code here:

int a-JoptionPane.showConfirmDialog(null, "DO YOU REALLY WANT TO CLOSE APPLICATION","SELECT", JoptionPane. YES_NO_OPTION);

if(a=0)

System.exit(0);

}

private void jButton1 Action Performed(java.awt.event.ActionEvent evt) {

// TODO add your handling code here:

if(jTextField1.getText().equals("HMS") &&jPasswordField1.getText().equals("LOGIN "))

{

setVisible(false);

new HOMEPAGE().setVisible(true);

}

else

JoptionPane.showMessageDialog(null, "INCORRECT PASSWORD "); USERNAME OR

}

/**

* @param args the command line arguments