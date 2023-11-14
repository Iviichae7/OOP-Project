
package goodhealthwellbeing.view;

import goodhealthwellbeing.SignupUser;
import goodhealthwellbeing.UserManager;
import java.awt.event.ActionEvent;

public class Register extends javax.swing.JFrame {
    
    private final UserManager userManager;
    private final SignupUser signupUser;
    
    public Register() {
        
        userManager = new UserManager();
        signupUser = new SignupUser(userManager);
        
        initComponents();
        
        this.setLocationRelativeTo(null);
        
        signupLoginBtn.setVisible(false);
        
        signupLoginBtn.addActionListener((ActionEvent e) -> {
            Login login = new Login();
            login.setVisible(true);
            Register.this.setVisible(false);
        });
        
        signupBtn.addActionListener((ActionEvent e) -> {
            signupLoginBtnActionPerformed(e);
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        signupMainPanel = new javax.swing.JPanel();
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
        signupIcon = new javax.swing.JLabel();
        signupErrorLabel = new javax.swing.JLabel();
        signupWelcomeLabel = new javax.swing.JLabel();
        signupLeftPanel = new javax.swing.JPanel();
        singupLogo = new javax.swing.JLabel();
        signupRights = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));
        setPreferredSize(new java.awt.Dimension(800, 500));
        setResizable(false);

        signupMainPanel.setBackground(new java.awt.Color(255, 255, 255));
        signupMainPanel.setPreferredSize(new java.awt.Dimension(800, 500));
        signupMainPanel.setLayout(null);

        signupRightPanel.setBackground(new java.awt.Color(255, 255, 255));
        signupRightPanel.setPreferredSize(new java.awt.Dimension(400, 500));
        signupRightPanel.setLayout(null);

        signupLoginBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        signupLoginBtn.setText("Login");
        signupLoginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupLoginBtnActionPerformed(evt);
            }
        });
        signupRightPanel.add(signupLoginBtn);
        signupLoginBtn.setBounds(37, 383, 140, 55);

        registerString.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        registerString.setForeground(new java.awt.Color(0, 102, 102));
        registerString.setText("SIGN UP");
        signupRightPanel.add(registerString);
        registerString.setBounds(152, 37, 99, 28);

        signupNameString.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        signupNameString.setText("Full Name");
        signupRightPanel.add(signupNameString);
        signupNameString.setBounds(37, 144, 114, 23);

        signupPasswordString.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        signupPasswordString.setText("Password");
        signupRightPanel.add(signupPasswordString);
        signupPasswordString.setBounds(37, 289, 330, 23);

        registerEmailString.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        registerEmailString.setText("Email");
        signupRightPanel.add(registerEmailString);
        registerEmailString.setBounds(37, 219, 163, 23);
        signupRightPanel.add(signupNameInput);
        signupNameInput.setBounds(37, 173, 330, 40);
        signupRightPanel.add(signupEmailInput);
        signupEmailInput.setBounds(37, 249, 330, 34);

        signupBtn.setBackground(new java.awt.Color(0, 102, 102));
        signupBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        signupBtn.setForeground(new java.awt.Color(255, 255, 255));
        signupBtn.setText("Sign Up");
        signupRightPanel.add(signupBtn);
        signupBtn.setBounds(227, 383, 140, 55);
        signupRightPanel.add(signupPasswordInput);
        signupPasswordInput.setBounds(37, 318, 330, 35);

        signupIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/signup.png"))); // NOI18N
        signupRightPanel.add(signupIcon);
        signupIcon.setBounds(158, 71, 69, 67);

        signupErrorLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        signupErrorLabel.setForeground(new java.awt.Color(255, 51, 0));
        signupRightPanel.add(signupErrorLabel);
        signupErrorLabel.setBounds(37, 360, 0, 0);

        signupWelcomeLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        signupWelcomeLabel.setForeground(new java.awt.Color(0, 102, 102));
        signupRightPanel.add(signupWelcomeLabel);
        signupWelcomeLabel.setBounds(30, 180, 370, 22);

        signupMainPanel.add(signupRightPanel);
        signupRightPanel.setBounds(400, 0, 400, 500);

        signupLeftPanel.setBackground(new java.awt.Color(0, 102, 102));
        signupLeftPanel.setPreferredSize(new java.awt.Dimension(400, 500));

        singupLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ApplicationLogo.png"))); // NOI18N

        signupRights.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        signupRights.setForeground(new java.awt.Color(255, 255, 255));
        signupRights.setText("© 2023 Good Health & Well Being. All Rights Reserved");

        javax.swing.GroupLayout signupLeftPanelLayout = new javax.swing.GroupLayout(signupLeftPanel);
        signupLeftPanel.setLayout(signupLeftPanelLayout);
        signupLeftPanelLayout.setHorizontalGroup(
            signupLeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(signupLeftPanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(signupLeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(signupRights)
                    .addComponent(singupLogo))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        signupLeftPanelLayout.setVerticalGroup(
            signupLeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(signupLeftPanelLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(singupLogo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(signupRights)
                .addGap(52, 52, 52))
        );

        signupMainPanel.add(signupLeftPanel);
        signupLeftPanel.setBounds(0, 0, 400, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(signupMainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(signupMainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void signupLoginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupLoginBtnActionPerformed
       
       String fullName = signupNameInput.getText();
       String email = signupEmailInput.getText();
       String password = new String(signupPasswordInput.getPassword());
       
        boolean success = signupUser.signupNewUser(fullName, email, password);
        
        if (success) {
            hideRegistrationComponents();
            signupWelcomeLabel.setText("Registration successful! Please log in.");
            signupWelcomeLabel.setVisible(true);

            int panelWidth = signupRightPanel.getWidth();
            int panelHeight = signupRightPanel.getHeight();
            int buttonWidth = signupLoginBtn.getWidth();
            int buttonHeight = signupLoginBtn.getHeight();

            signupLoginBtn.setBounds((panelWidth - buttonWidth) / 2, (panelHeight - buttonHeight) / 2, buttonWidth, buttonHeight);
            signupLoginBtn.setVisible(true);
        } else {
            signupErrorLabel.setText("Registration failed. User already exists or invalid input.");
        }
    }//GEN-LAST:event_signupLoginBtnActionPerformed

    private void hideRegistrationComponents() {
        registerEmailString.setVisible(false);
        registerString.setVisible(false);
        signupBtn.setVisible(false);
        signupEmailInput.setVisible(false);
        signupNameInput.setVisible(false);
        signupPasswordInput.setVisible(false);
        signupNameString.setVisible(false);
        signupPasswordString.setVisible(false);
        signupErrorLabel.setVisible(false);
    }
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new Register().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel registerEmailString;
    private javax.swing.JLabel registerString;
    private javax.swing.JButton signupBtn;
    private javax.swing.JTextField signupEmailInput;
    private javax.swing.JLabel signupErrorLabel;
    private javax.swing.JLabel signupIcon;
    private javax.swing.JPanel signupLeftPanel;
    private javax.swing.JButton signupLoginBtn;
    private javax.swing.JPanel signupMainPanel;
    private javax.swing.JTextField signupNameInput;
    private javax.swing.JLabel signupNameString;
    private javax.swing.JPasswordField signupPasswordInput;
    private javax.swing.JLabel signupPasswordString;
    private javax.swing.JPanel signupRightPanel;
    private javax.swing.JLabel signupRights;
    private javax.swing.JLabel signupWelcomeLabel;
    private javax.swing.JLabel singupLogo;
    // End of variables declaration//GEN-END:variables
}
