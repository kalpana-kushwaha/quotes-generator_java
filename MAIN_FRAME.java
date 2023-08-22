/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package test.project;

/**
 *
 * @author kalpa
 */
public class MAIN_FRAME extends javax.swing.JFrame
{

    /**
     * Creates new form NewJFrame
     */
    public MAIN_FRAME ()
    {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        bgPanel1 = new javax.swing.JPanel();
        toppanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        HOME_ = new javax.swing.JButton();
        RANDOM_QUOTES = new javax.swing.JButton();
        ADD_QUOTES = new javax.swing.JButton();
        EXIT = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(java.awt.Color.darkGray);
        setResizable(false);

        bgPanel1.setBackground(new java.awt.Color(5, 30, 30));
        bgPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bgPanel1.setForeground(new java.awt.Color(204, 255, 204));
        bgPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bgPanel1.setFocusCycleRoot(true);
        bgPanel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        bgPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        toppanel.setBackground(new java.awt.Color(0, 0, 51));

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setFont(new java.awt.Font("Serif", 3, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("QUOTES HUB");
        jLabel1.setToolTipText("");

        javax.swing.GroupLayout toppanelLayout = new javax.swing.GroupLayout(toppanel);
        toppanel.setLayout(toppanelLayout);
        toppanelLayout.setHorizontalGroup(
            toppanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, toppanelLayout.createSequentialGroup()
                .addContainerGap(276, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(269, 269, 269))
        );
        toppanelLayout.setVerticalGroup(
            toppanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(toppanelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        bgPanel1.add(toppanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 35, 890, -1));

        HOME_.setBackground(new java.awt.Color(0, 0, 0));
        HOME_.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        HOME_.setForeground(new java.awt.Color(204, 255, 204));
        HOME_.setText("HOME-CATEGORIES");
        HOME_.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(255, 255, 204), null, null));
        HOME_.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                HOME_ActionPerformed(evt);
            }
        });
        bgPanel1.add(HOME_, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 180, 240, 50));

        RANDOM_QUOTES.setBackground(new java.awt.Color(0, 0, 0));
        RANDOM_QUOTES.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        RANDOM_QUOTES.setForeground(new java.awt.Color(204, 255, 204));
        RANDOM_QUOTES.setText("RANDOM QUOTES");
        RANDOM_QUOTES.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(255, 255, 204), null, null));
        RANDOM_QUOTES.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                RANDOM_QUOTESActionPerformed(evt);
            }
        });
        bgPanel1.add(RANDOM_QUOTES, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 250, 240, 50));

        ADD_QUOTES.setBackground(new java.awt.Color(0, 0, 0));
        ADD_QUOTES.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        ADD_QUOTES.setForeground(new java.awt.Color(204, 255, 204));
        ADD_QUOTES.setText("ADD QUOTES");
        ADD_QUOTES.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(255, 255, 204), null, null));
        ADD_QUOTES.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                ADD_QUOTESActionPerformed(evt);
            }
        });
        bgPanel1.add(ADD_QUOTES, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 320, 240, 50));

        EXIT.setBackground(new java.awt.Color(0, 0, 0));
        EXIT.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        EXIT.setForeground(new java.awt.Color(204, 255, 204));
        EXIT.setText("EXIT");
        EXIT.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(255, 255, 204), null, null));
        EXIT.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                EXITActionPerformed(evt);
            }
        });
        bgPanel1.add(EXIT, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 390, 240, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 564, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void EXITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EXITActionPerformed
        // TODO add your handling code here
        this.dispose();
    }//GEN-LAST:event_EXITActionPerformed

    private void ADD_QUOTESActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADD_QUOTESActionPerformed
        new add_quote().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ADD_QUOTESActionPerformed

    private void RANDOM_QUOTESActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RANDOM_QUOTESActionPerformed
        // TODO add your handling code here;
        new random_quote().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_RANDOM_QUOTESActionPerformed

    private void HOME_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HOME_ActionPerformed
        // TODO add your handling code here:
        new categories().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_HOME_ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main (String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try
          {
            for(javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
              {
                if("Nimbus".equals(info.getName()))
                  {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                  }
              }
          }
        catch(ClassNotFoundException ex)
          {
            java.util.logging.Logger.getLogger(MAIN_FRAME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
          }
        catch(InstantiationException ex)
          {
            java.util.logging.Logger.getLogger(MAIN_FRAME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
          }
        catch(IllegalAccessException ex)
          {
            java.util.logging.Logger.getLogger(MAIN_FRAME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
          }
        catch(javax.swing.UnsupportedLookAndFeelException ex)
          {
            java.util.logging.Logger.getLogger(MAIN_FRAME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
          }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run ()
            {
                new MAIN_FRAME().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ADD_QUOTES;
    private javax.swing.JButton EXIT;
    private javax.swing.JButton HOME_;
    private javax.swing.JButton RANDOM_QUOTES;
    private javax.swing.JPanel bgPanel1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel toppanel;
    // End of variables declaration//GEN-END:variables
}
