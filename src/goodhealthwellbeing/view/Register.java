
package goodhealthwellbeing.view;

import java.awt.event.ActionEvent;

public class Register extends javax.swing.JFrame {
    
    public Register() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        signupLoginBtn.addActionListener((ActionEvent e) -> {
            Login login = new Login();
            login.setVisible(true);
            Register.this.setVisible(false);
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        signupRightPanel = new javax.swing.JPanel();
        signupLoginBtn = new javax.swing.JButton();
        registerString = new javax.swing.JLabel();
        signupNameString = new javax.swing.JLabel();
        signupPasswordString = new javax.swing.JLabel();
        registerEmailString = new javax.swing.JLabel();
        signupNameInput = new javax.swing.JTextField();
        signupEmailInput = new javax.swing.JTextField();
        signupBtn = new javax.swing.JButton();
        signupPasswordInput = new javax.swing.JPasswordField();
        signupLeftPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(null);

        signupRightPanel.setBackground(new java.awt.Color(255, 255, 255));
        signupRightPanel.setPreferredSize(new java.awt.Dimension(400, 500));

        signupLoginBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        signupLoginBtn.setText("Login");
        signupLoginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupLoginBtnActionPerformed(evt);
            }
        });

        registerString.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        registerString.setText("SIGN UP");

        signupNameString.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        signupNameString.setText("Full Name");

        signupPasswordString.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        signupPasswordString.setText("Password");

        registerEmailString.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        registerEmailString.setText("Email");

        signupBtn.setBackground(new java.awt.Color(0, 102, 102));
        signupBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        signupBtn.setForeground(new java.awt.Color(255, 255, 255));
        signupBtn.setText("Sign Up");

        signupPasswordInput.setText("jPasswordField1");

        javax.swing.GroupLayout signupRightPanelLayout = new javax.swing.GroupLayout(signupRightPanel);
        signupRightPanel.setLayout(signupRightPanelLayout);
        signupRightPanelLayout.setHorizontalGroup(
            signupRightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, signupRightPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(registerString, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(131, 131, 131))
            .addGroup(signupRightPanelLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(signupRightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(signupRightPanelLayout.createSequentialGroup()
                        .addComponent(signupBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(signupLoginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(signupPasswordInput)
                    .addComponent(signupEmailInput, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(registerEmailString, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(signupNameString, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(signupNameInput, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(signupPasswordString, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        signupRightPanelLayout.setVerticalGroup(
            signupRightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(signupRightPanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(registerString, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(signupNameString, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(signupNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(registerEmailString, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(signupEmailInput, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(signupPasswordString, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(signupPasswordInput, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(signupRightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(signupBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(signupLoginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(74, Short.MAX_VALUE))
        );

        jPanel1.add(signupRightPanel);
        signupRightPanel.setBounds(400, 0, 400, 500);

        signupLeftPanel.setBackground(new java.awt.Color(0, 102, 102));
        signupLeftPanel.setPreferredSize(new java.awt.Dimension(400, 500));

        javax.swing.GroupLayout signupLeftPanelLayout = new javax.swing.GroupLayout(signupLeftPanel);
        signupLeftPanel.setLayout(signupLeftPanelLayout);
        signupLeftPanelLayout.setHorizontalGroup(
            signupLeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        signupLeftPanelLayout.setVerticalGroup(
            signupLeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        jPanel1.add(signupLeftPanel);
        signupLeftPanel.setBounds(0, 0, 400, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 127, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 119, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void signupLoginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupLoginBtnActionPerformed
       
    }//GEN-LAST:event_signupLoginBtnActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new Register().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel registerEmailString;
    private javax.swing.JLabel registerString;
    private javax.swing.JButton signupBtn;
    private javax.swing.JTextField signupEmailInput;
    private javax.swing.JPanel signupLeftPanel;
    private javax.swing.JButton signupLoginBtn;
    private javax.swing.JTextField signupNameInput;
    private javax.swing.JLabel signupNameString;
    private javax.swing.JPasswordField signupPasswordInput;
    private javax.swing.JLabel signupPasswordString;
    private javax.swing.JPanel signupRightPanel;
    // End of variables declaration//GEN-END:variables
}
