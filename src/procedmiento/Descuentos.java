/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package procedmiento;

/**
 *
 * @author Marcos Sarmientos
 */
public class Descuentos extends javax.swing.JFrame {

    /**
     * Creates new form Descuentos
     */
    public Descuentos() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cmdCalcular = new javax.swing.JButton();
        cmdBorrar = new javax.swing.JButton();
        txtSueldoBase = new javax.swing.JTextField();
        txtDescuento05 = new javax.swing.JTextField();
        txtDescuento1 = new javax.swing.JTextField();
        txtDescuento4 = new javax.swing.JTextField();
        txtDescuento5 = new javax.swing.JTextField();
        txtSueldoFinal = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("DESCUENTO DEL SUELDO");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, -1));

        jLabel2.setText("Sueldo Base");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, -1, -1));

        jLabel3.setText("Ley Politica Publica 1%");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jLabel4.setText("Seguro Social 4%");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, 20));

        jLabel5.setText("Seguro Forzoso 0.5%");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, 20));

        jLabel6.setText("Caja de ahorro 5%");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, 20));

        jLabel7.setText("Sueldo Final");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, -1, -1));

        cmdCalcular.setText("Calcular");
        cmdCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCalcularActionPerformed(evt);
            }
        });
        getContentPane().add(cmdCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, -1, -1));

        cmdBorrar.setText("Borrar");
        cmdBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdBorrarActionPerformed(evt);
            }
        });
        getContentPane().add(cmdBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, -1, -1));

        txtSueldoBase.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSueldoBaseKeyTyped(evt);
            }
        });
        getContentPane().add(txtSueldoBase, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, 70, -1));

        txtDescuento05.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescuento05ActionPerformed(evt);
            }
        });
        getContentPane().add(txtDescuento05, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 70, -1));

        txtDescuento1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescuento1ActionPerformed(evt);
            }
        });
        getContentPane().add(txtDescuento1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 70, -1));
        getContentPane().add(txtDescuento4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 70, -1));

        txtDescuento5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescuento5ActionPerformed(evt);
            }
        });
        getContentPane().add(txtDescuento5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 70, -1));
        getContentPane().add(txtSueldoFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 210, 70, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdBorrarActionPerformed
     txtSueldoBase.setText("");
     txtDescuento1.setText("");
     txtDescuento4.setText("");
     txtDescuento05.setText("");
     txtDescuento5.setText("");
     txtSueldoFinal.setText("");
     txtSueldoBase.requestFocusInWindow();
    }//GEN-LAST:event_cmdBorrarActionPerformed

    private void txtDescuento05ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescuento05ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescuento05ActionPerformed

    private void txtDescuento1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescuento1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescuento1ActionPerformed

    private void txtDescuento5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescuento5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescuento5ActionPerformed

    private void cmdCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCalcularActionPerformed
        double d1, d2, d3, d4, total,totalf, base;
        String des1, des2, des3, des4, sfinal;

    if(txtSueldoBase.getText().trim().isEmpty()){
         JOptionPane.showMessageDialog(this, "Digite sueldo base","error", JOptionPane.ERROR_MESSAGE);
         txtSueldoBase.requestFocusInWindow();
         txtSueldoBase.selectAll();
       }
    else{        
        base=Double.parseDouble(txtSueldoBase.getText());
    
        d1=(base*0.01);
        d2=(base*0.04);
        d3=(base*0.005);
        d4=(base*0.05);
        
       total=(d1+d2+d3+d4);
       totalf=(base-total);
        
        
      des1=String.valueOf(d1);
    txtDescuento1.setText (des1);    
    
    des2=String.valueOf(d2);
    txtDescuento4.setText (des2);  
    
    des3=String.valueOf(d3);
    txtDescuento05.setText(des3); 

    des4=String.valueOf(d4);
    txtDescuento5.setText(des4);  
        
    sfinal=String.valueOf(totalf);
    txtSueldoFinal.setText(sfinal);   
     
     }
    }//GEN-LAST:event_cmdCalcularActionPerformed

    private void txtSueldoBaseKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSueldoBaseKeyTyped
        char c=evt.getKeyChar(); 
       
          if(!Character.isDigit(c)) {
              
              getToolkit().beep();    
              evt.consume(); 
          }
    }//GEN-LAST:event_txtSueldoBaseKeyTyped

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
            java.util.logging.Logger.getLogger(Descuentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Descuentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Descuentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Descuentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Descuentos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdBorrar;
    private javax.swing.JButton cmdCalcular;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtDescuento05;
    private javax.swing.JTextField txtDescuento1;
    private javax.swing.JTextField txtDescuento4;
    private javax.swing.JTextField txtDescuento5;
    private javax.swing.JTextField txtSueldoBase;
    private javax.swing.JTextField txtSueldoFinal;
    // End of variables declaration//GEN-END:variables
}
