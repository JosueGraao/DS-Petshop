/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/**
 *
 * @author Laboratorio-Info
 */
public class Agenda_GUI extends javax.swing.JFrame {

    /**
     * Creates new form Agenda_GUI
     */
    public Agenda_GUI() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        iconLabel = new javax.swing.JLabel();
        dogIcon = new javax.swing.JLabel();
        voltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Agendamentos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel1.setLayout(null);

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Nome do cliente");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(20, 210, 200, 16);
        jPanel1.add(jTextField1);
        jTextField1.setBounds(20, 230, 390, 24);

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nome do(s) pet(s)");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(450, 210, 200, 16);
        jPanel1.add(jTextField2);
        jTextField2.setBounds(450, 230, 390, 24);

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Motivo da visita");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, 270, 200, 16);
        jPanel1.add(jTextField3);
        jTextField3.setBounds(20, 290, 390, 24);

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Veterinário");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(450, 270, 200, 20);
        jPanel1.add(jTextField4);
        jTextField4.setBounds(450, 290, 390, 24);

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Data");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(20, 330, 200, 16);
        jPanel1.add(jTextField5);
        jTextField5.setBounds(20, 350, 390, 24);

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Horário");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(450, 330, 200, 16);
        jPanel1.add(jTextField6);
        jTextField6.setBounds(450, 350, 390, 24);

        iconLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/person.png"))); // NOI18N
        jPanel1.add(iconLabel);
        iconLabel.setBounds(160, 40, 128, 150);

        dogIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/dog.png"))); // NOI18N
        jPanel1.add(dogIcon);
        dogIcon.setBounds(570, 60, 130, 120);

        voltar.setText("Voltar");
        voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarActionPerformed(evt);
            }
        });
        jPanel1.add(voltar);
        voltar.setBounds(420, 430, 100, 32);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 900, 500);

        setSize(new java.awt.Dimension(900, 500));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarActionPerformed
        dispose();
        new AInicio_GUI().setVisible(true);
    }//GEN-LAST:event_voltarActionPerformed

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
            java.util.logging.Logger.getLogger(Agenda_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agenda_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agenda_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agenda_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Agenda_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel dogIcon;
    private javax.swing.JLabel iconLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JButton voltar;
    // End of variables declaration//GEN-END:variables
}
