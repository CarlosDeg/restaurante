/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurante_pro.menu_opciones;

import restaurante_pro.conectarbd;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import restaurante_pro.Iniciar_Sesion;

/**
 *
 * @author stikeroox
 */
public class nuevo_user extends javax.swing.JFrame {
        PreparedStatement ps;
        ResultSet rs;
    /**
     * Creates new form nuevo_user
     */
    public nuevo_user() {
        initComponents();
    setLocationRelativeTo( null );
    setTitle("Registro de usuario");
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Nombre = new javax.swing.JTextField();
        ApellidoP = new javax.swing.JTextField();
        ApellidoM = new javax.swing.JTextField();
        Telefono = new javax.swing.JTextField();
        Correo = new javax.swing.JTextField();
        Contrasena = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        R1 = new javax.swing.JLabel();
        R2 = new javax.swing.JLabel();
        R3 = new javax.swing.JLabel();
        R4 = new javax.swing.JLabel();
        R5 = new javax.swing.JLabel();
        R6 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 98, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Apellido Paterno");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 134, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Apellido Materno");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 176, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Telefono");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 210, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Correo");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 252, -1, -1));

        jLabel6.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Contraseña");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 286, -1, -1));
        getContentPane().add(Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 94, 177, -1));

        ApellidoP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ApellidoPActionPerformed(evt);
            }
        });
        getContentPane().add(ApellidoP, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 130, 177, -1));

        ApellidoM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ApellidoMActionPerformed(evt);
            }
        });
        getContentPane().add(ApellidoM, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 172, 177, -1));
        getContentPane().add(Telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 206, 177, -1));
        getContentPane().add(Correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 248, 177, -1));
        getContentPane().add(Contrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 283, 177, -1));

        jButton1.setText("Nuevo");
        jButton1.setOpaque(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 370, 100, -1));

        jButton2.setText("Registrar");
        jButton2.setOpaque(false);
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 370, 90, -1));

        jButton3.setText("Salir");
        jButton3.setOpaque(false);
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 70, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restaurante_pro/imagenes/generatedtext (10).png"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 288, 78));
        getContentPane().add(R1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 100, 100, 20));
        getContentPane().add(R2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 136, 100, 20));
        getContentPane().add(R3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 180, 110, 20));
        getContentPane().add(R4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 210, 110, 20));
        getContentPane().add(R5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 250, 110, 20));
        getContentPane().add(R6, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 290, 110, 20));

        jButton4.setText("Modificar");
        jButton4.setOpaque(false);
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 370, -1, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restaurante_pro/iconos/lineas-azules-1813.jpg"))); // NOI18N
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //aceso al sistema y coneccion ala base de datos
    public void acceso_usuarios( String usuario,String pass){
        
        
    }
    private void ApellidoMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ApellidoMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ApellidoMActionPerformed
  public void validar(){
       String Nom ,  Ap = null, Apm = null,  Cor = null,  Con = null, cla = null;
        String tel = null; 
      
            
        Nom=Nombre.getText();
        Ap=ApellidoP.getText();
        Apm=ApellidoM.getText();
        tel=Telefono.getText();
        Cor=Correo.getText();
        Con=Contrasena.getText();
            
          try{
            
        validaciones v5=new validaciones( Nom,  Ap,  Apm,  Cor,  Con, cla,tel);
        
        R1.setText(v5.validar_nombre());
        R2.setText(v5.validar_ap());
        R3.setText(v5.validar_am());
        R4.setText(v5.valtel());
        R5.setText(v5.validar_correo());
        R6.setText(v5.validar_pass());
        }catch(Exception e){
            
        }
  }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        conectarbd con=new conectarbd();
Connection reg=con.getconexion();
String nom,ape1,ape2,tel,co,cont;
String sql;
nom=Nombre.getText();
ape1=ApellidoP.getText();
ape2=ApellidoM.getText();
tel=Telefono.getText();
co=Correo.getText();
cont=Contrasena.getText();
validar();

sql="INSERT INTO nuevo_user (Nombre,Apellidop,Apellidom,Telefono,Correo,Contrasena)VALUES (?,?,?,?,?,?)";
        try {
            PreparedStatement pst=reg.prepareStatement(sql);
            pst.setString(1,nom);
            pst.setString(2,ape1);
            pst.setString(3,ape2);
            pst.setString(4,tel);
            pst.setString(5,co);
            pst.setString(6,cont);
          
            int n=pst.executeUpdate();
            if (n>0){
                JOptionPane.showMessageDialog(null,"registrado con exito");
                
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(nuevo_user.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }//GEN-LAST:event_jButton2ActionPerformed
   public void limpiar(){
     Nombre.setText("");
     ApellidoP.setText("");
     ApellidoM.setText("");
     Correo.setText("");
     Contrasena.setText("");
     Telefono.setText("");
       
   }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
     limpiar();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
        //BTOON DE REGISTRAR
        
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        // TODO add your handling code here:
         Iniciar_Sesion i1=new Iniciar_Sesion();
        i1.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton3MouseClicked

    private void ApellidoPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ApellidoPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ApellidoPActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(nuevo_user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(nuevo_user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(nuevo_user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(nuevo_user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new nuevo_user().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ApellidoM;
    private javax.swing.JTextField ApellidoP;
    private javax.swing.JPasswordField Contrasena;
    private javax.swing.JTextField Correo;
    private javax.swing.JTextField Nombre;
    private javax.swing.JLabel R1;
    private javax.swing.JLabel R2;
    private javax.swing.JLabel R3;
    private javax.swing.JLabel R4;
    private javax.swing.JLabel R5;
    private javax.swing.JLabel R6;
    private javax.swing.JTextField Telefono;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
