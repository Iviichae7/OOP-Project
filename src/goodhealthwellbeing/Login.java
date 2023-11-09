
package goodhealthwellbeing;

import java.awt.event.ActionEvent;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        
        loginBackBtn.addActionListener((ActionEvent e) -> {
            Login.this.dispose();
            new Register().setVisible(true);
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loginMainPanel = new javax.swing.JPanel();
        loginLeftPanel = new javax.swing.JPanel();
        loginRightPanel = new javax.swing.JPanel();
        loginLoginLabel = new javax.swing.JLabel();
        loginEmailLabel = new javax.swing.JLabel();
        loginEmailInput = new javax.swing.JTextField();
        loginBackBtn = new javax.swing.JButton();
        loginPasswordLabel = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        loginBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 500));

        loginMainPanel.setBackground(new java.awt.Color(255, 255, 255));
        loginMainPanel.setPreferredSize(new java.awt.Dimension(800, 500));
        loginMainPanel.setLayout(null);

        loginLeftPanel.setBackground(new java.awt.Color(0, 102, 102));
        loginLeftPanel.setPreferredSize(new java.awt.Dimension(400, 500));

        javax.swing.GroupLayout loginLeftPanelLayout = new javax.swing.GroupLayout(loginLeftPanel);
        loginLeftPanel.setLayout(loginLeftPanelLayout);
        loginLeftPanelLayout.setHorizontalGroup(
            loginLeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        loginLeftPanelLayout.setVerticalGroup(
            loginLeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        loginMainPanel.add(loginLeftPanel);
        loginLeftPanel.setBounds(0, 0, 400, 500);

        loginRightPanel.setBackground(new java.awt.Color(255, 255, 255));
        loginRightPanel.setMinimumSize(new java.awt.Dimension(400, 500));

        loginLoginLabel.setBackground(new java.awt.Color(255, 255, 255));
        loginLoginLabel.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        loginLoginLabel.setForeground(new java.awt.Color(0, 102, 102));
        loginLoginLabel.setText("LOGIN");

        loginEmailLabel.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        loginEmailLabel.setText("Email");

        loginBackBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        loginBackBtn.setText("Sign Up");
        loginBackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBackBtnActionPerformed(evt);
            }
        });

        loginPasswordLabel.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        loginPasswordLabel.setText("Password");

        jPasswordField1.setText("jPasswordField1");

        loginBtn.setBackground(new java.awt.Color(0, 102, 102));
        loginBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        loginBtn.setText("Login");
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel1.setText("I don't have an account");

        javax.swing.GroupLayout loginRightPanelLayout = new javax.swing.GroupLayout(loginRightPanel);
        loginRightPanel.setLayout(loginRightPanelLayout);
        loginRightPanelLayout.setHorizontalGroup(
            loginRightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginRightPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(loginLoginLabel)
                .addGap(147, 147, 147))
            .addGroup(loginRightPanelLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(loginRightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(loginRightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginRightPanelLayout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(loginBackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jPasswordField1, javax.swing.GroupLayout.DEFAULT_SIZE, 341, Short.MAX_VALUE)
                        .addComponent(loginEmailLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(loginPasswordLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(loginEmailInput)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        loginRightPanelLayout.setVerticalGroup(
            loginRightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginRightPanelLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(loginLoginLabel)
                .addGap(72, 72, 72)
                .addComponent(loginEmailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loginEmailInput, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loginPasswordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(loginRightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginBackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(55, 55, 55))
        );

        loginMainPanel.add(loginRightPanel);
        loginRightPanel.setBounds(400, 0, 400, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(loginMainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(loginMainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginBtnActionPerformed

    private void loginBackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBackBtnActionPerformed
        
    }//GEN-LAST:event_loginBackBtnActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Login().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JButton loginBackBtn;
    private javax.swing.JButton loginBtn;
    private javax.swing.JTextField loginEmailInput;
    private javax.swing.JLabel loginEmailLabel;
    private javax.swing.JPanel loginLeftPanel;
    private javax.swing.JLabel loginLoginLabel;
    private javax.swing.JPanel loginMainPanel;
    private javax.swing.JLabel loginPasswordLabel;
    private javax.swing.JPanel loginRightPanel;
    // End of variables declaration//GEN-END:variables
}
