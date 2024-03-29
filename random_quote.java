/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package test.project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author kalpa
 */
public class random_quote extends javax.swing.JFrame
{

    /**
     * Creates new form random_quote
     */
    public random_quote ()
    {
        initComponents();
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;
        String dbUrl = "jdbc:mysql://localhost:3306/quotes";
        String dbUsr = "root";
        String dbPass = "2507";

        try
          {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(dbUrl, dbUsr, dbPass);
            st = conn.createStatement();
            rs = st.executeQuery("SELECT quote_type,quote FROM quotes ORDER BY RAND() LIMIT 1");

            if(rs.next())
              {
                String quoteName = rs.getString("quote_type");
                String quoteDesc = rs.getString("quote");

                category_area.setText(quoteName);
                quote_area.setText(quoteDesc);

              }
            else
              {
                category_area.setText("");
                quote_area.setText("");
              }
          }
        catch(ClassNotFoundException | SQLException e)
          {
            JOptionPane.showMessageDialog(null, e);
          }
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jPanel1 = new javax.swing.JPanel();
        categoryLabel1 = new javax.swing.JLabel();
        quotelabel = new javax.swing.JLabel();
        header = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        category_area = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        quote_area = new javax.swing.JTextArea();
        anotherquote_button = new javax.swing.JButton();
        menu_Button1 = new javax.swing.JButton();
        EXIT = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(5, 30, 30));

        categoryLabel1.setBackground(new java.awt.Color(0, 0, 51));
        categoryLabel1.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        categoryLabel1.setForeground(new java.awt.Color(255, 204, 204));
        categoryLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        categoryLabel1.setText("CATEGORY:-");
        categoryLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        categoryLabel1.setOpaque(true);

        quotelabel.setBackground(new java.awt.Color(0, 0, 51));
        quotelabel.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        quotelabel.setForeground(new java.awt.Color(255, 204, 204));
        quotelabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        quotelabel.setText("QUOTE:-");
        quotelabel.setOpaque(true);

        header.setBackground(new java.awt.Color(51, 51, 51));
        header.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        header.setForeground(new java.awt.Color(255, 255, 204));
        header.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        header.setText("RANDOM QUOTE");
        header.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 51, 51), new java.awt.Color(204, 255, 204)));
        header.setOpaque(true);

        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        category_area.setEditable(false);
        category_area.setBackground(new java.awt.Color(255, 255, 255));
        category_area.setColumns(1);
        category_area.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        category_area.setForeground(new java.awt.Color(0, 0, 0));
        category_area.setLineWrap(true);
        category_area.setRows(1);
        category_area.setWrapStyleWord(true);
        category_area.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true));
        jScrollPane1.setViewportView(category_area);

        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        quote_area.setBackground(new java.awt.Color(255, 255, 255));
        quote_area.setColumns(1);
        quote_area.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        quote_area.setForeground(new java.awt.Color(0, 0, 0));
        quote_area.setLineWrap(true);
        quote_area.setRows(1);
        quote_area.setWrapStyleWord(true);
        quote_area.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true));
        jScrollPane2.setViewportView(quote_area);

        anotherquote_button.setBackground(new java.awt.Color(0, 0, 0));
        anotherquote_button.setFont(new java.awt.Font("Franklin Gothic Demi", 2, 14)); // NOI18N
        anotherquote_button.setForeground(new java.awt.Color(204, 255, 204));
        anotherquote_button.setText("Show Another Quote");
        anotherquote_button.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        anotherquote_button.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                anotherquote_buttonActionPerformed(evt);
            }
        });

        menu_Button1.setBackground(new java.awt.Color(0, 0, 0));
        menu_Button1.setFont(new java.awt.Font("Franklin Gothic Demi", 2, 14)); // NOI18N
        menu_Button1.setForeground(new java.awt.Color(204, 255, 204));
        menu_Button1.setText("MAIN MENU");
        menu_Button1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        menu_Button1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                menu_Button1ActionPerformed(evt);
            }
        });

        EXIT.setBackground(new java.awt.Color(0, 0, 0));
        EXIT.setFont(new java.awt.Font("Franklin Gothic Demi", 2, 14)); // NOI18N
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(categoryLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(quotelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 558, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(274, 274, 274)
                        .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(menu_Button1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(anotherquote_button, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(EXIT, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(195, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(categoryLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(quotelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(menu_Button1)
                    .addComponent(anotherquote_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(EXIT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void anotherquote_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anotherquote_buttonActionPerformed
        // TODO add your handling code here:
        new random_quote().setVisible(true);
        dispose();
    }//GEN-LAST:event_anotherquote_buttonActionPerformed

    private void menu_Button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_Button1ActionPerformed
        // TODO add your handling code here:
        new MAIN_FRAME().setVisible(true);
        dispose();
    }//GEN-LAST:event_menu_Button1ActionPerformed

    private void EXITActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_EXITActionPerformed
    {//GEN-HEADEREND:event_EXITActionPerformed
        // TODO add your handling code here
        this.dispose();
    }//GEN-LAST:event_EXITActionPerformed

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
            java.util.logging.Logger.getLogger(random_quote.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

          }
        catch(InstantiationException ex)
          {
            java.util.logging.Logger.getLogger(random_quote.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

          }
        catch(IllegalAccessException ex)
          {
            java.util.logging.Logger.getLogger(random_quote.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

          }
        catch(javax.swing.UnsupportedLookAndFeelException ex)
          {
            java.util.logging.Logger.getLogger(random_quote.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
          }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run ()
            {
                new random_quote().setVisible(true);
                System.out.println("success");

            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EXIT;
    private javax.swing.JButton anotherquote_button;
    private javax.swing.JLabel categoryLabel1;
    private javax.swing.JTextArea category_area;
    private javax.swing.JLabel header;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton menu_Button1;
    private javax.swing.JTextArea quote_area;
    private javax.swing.JLabel quotelabel;
    // End of variables declaration//GEN-END:variables

}
