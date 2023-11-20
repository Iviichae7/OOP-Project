package goodhealthwellbeing.view.ui;

import java.awt.event.ActionEvent;

import goodhealthwellbeing.model.UserManager;

public class Login extends javax.swing.JFrame {

    private final UserManager userManager;

    public Login() {

        userManager = UserManager.getUser();

        initComponents();

        this.setLocationRelativeTo(null);

        loginSignupBtn.addActionListener((ActionEvent e) -> {
            Login.this.dispose();
            new Register().setVisible(true);
        });

        loginBtn.addActionListener((ActionEvent e) -> {
            loginBtnActionPerformed(e);
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loginMainPanel = new javax.swing.JPanel();
        loginLeftPanel = new javax.swing.JPanel();
        loginLogo = new javax.swing.JLabel();
        logoRights = new javax.swing.JLabel();
        loginRightPanel = new javax.swing.JPanel();
        loginLoginLabel = new javax.swing.JLabel();
        loginEmailLabel = new javax.swing.JLabel();
        loginEmailInput = new javax.swing.JTextField();
        loginSignupBtn = new javax.swing.JButton();
        loginPasswordLabel = new javax.swing.JLabel();
        loginPasswordInput = new javax.swing.JPasswordField();
        loginBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        loginErrorMessage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 500));
        setResizable(false);

        loginMainPanel.setBackground(new java.awt.Color(255, 255, 255));
        loginMainPanel.setPreferredSize(new java.awt.Dimension(800, 500));
        loginMainPanel.setLayout(null);

        loginLeftPanel.setBackground(new java.awt.Color(0, 102, 102));
        loginLeftPanel.setPreferredSize(new java.awt.Dimension(400, 500));
        loginLeftPanel.setLayout(null);

        loginLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ApplicationLogo.png"))); // NOI18N
        loginLeftPanel.add(loginLogo);
        loginLogo.setBounds(25, 33, 350, 350);

        logoRights.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        logoRights.setForeground(new java.awt.Color(255, 255, 255));
        logoRights.setText("© 2023 Good Health & Well Being. All Rights Reserved");
        loginLeftPanel.add(logoRights);
        logoRights.setBounds(30, 431, 346, 17);

        loginMainPanel.add(loginLeftPanel);
        loginLeftPanel.setBounds(0, 0, 400, 500);

        loginRightPanel.setBackground(new java.awt.Color(255, 255, 255));
        loginRightPanel.setMinimumSize(new java.awt.Dimension(400, 500));

        loginLoginLabel.setBackground(new java.awt.Color(255, 255, 255));
        loginLoginLabel.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        loginLoginLabel.setForeground(new java.awt.Color(0, 102, 102));
        loginLoginLabel.setText("LOGIN");

        loginEmailLabel.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        loginEmailLabel.setText("Email");

        loginSignupBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        loginSignupBtn.setText("Sign Up");
        loginSignupBtn.setPreferredSize(new java.awt.Dimension(75, 25));

        loginPasswordLabel.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        loginPasswordLabel.setText("Password");

        loginBtn.setBackground(new java.awt.Color(0, 102, 102));
        loginBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        loginBtn.setForeground(new java.awt.Color(255, 255, 255));
        loginBtn.setText("Log In");
        loginBtn.setPreferredSize(new java.awt.Dimension(75, 25));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel1.setText("I don't have an account");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/users.png"))); // NOI18N

        loginErrorMessage.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        loginErrorMessage.setForeground(new java.awt.Color(255, 51, 0));

        javax.swing.GroupLayout loginRightPanelLayout = new javax.swing.GroupLayout(loginRightPanel);
        loginRightPanel.setLayout(loginRightPanelLayout);
        loginRightPanelLayout.setHorizontalGroup(
            loginRightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginRightPanelLayout.createSequentialGroup()
                .addGap(162, 162, 162)
                .addComponent(loginLoginLabel))
            .addGroup(loginRightPanelLayout.createSequentialGroup()
                .addGap(162, 162, 162)
                .addComponent(jLabel2))
            .addGroup(loginRightPanelLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(loginEmailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(loginRightPanelLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(loginEmailInput, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(loginRightPanelLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(loginPasswordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(loginRightPanelLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addGap(106, 106, 106)
                .addComponent(loginSignupBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(loginRightPanelLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(loginRightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loginRightPanelLayout.createSequentialGroup()
                        .addComponent(loginErrorMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addComponent(loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(loginPasswordInput, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        loginRightPanelLayout.setVerticalGroup(
            loginRightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginRightPanelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(loginLoginLabel)
                .addGap(12, 12, 12)
                .addComponent(jLabel2)
                .addGap(12, 12, 12)
                .addComponent(loginEmailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(loginEmailInput, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(loginPasswordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(loginPasswordInput, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(loginRightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loginErrorMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(loginRightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginSignupBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)))
        );

        loginMainPanel.add(loginRightPanel);
        loginRightPanel.setBounds(400, 0, 374, 439);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(loginMainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(loginMainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_loginBtnActionPerformed
        String inputEmail = loginEmailInput.getText();
        String inputPassword = new String(loginPasswordInput.getPassword());

        if (userManager.validateUser(inputEmail, inputPassword)) {
            loginErrorMessage.setText("");
            Modules modules = Modules.getInstance();
            modules.setVisible(true);
            this.dispose();
        } else {
            loginErrorMessage.setText("Incorrect login details");
        }
    }// GEN-LAST:event_loginBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton loginBtn;
    private javax.swing.JTextField loginEmailInput;
    private javax.swing.JLabel loginEmailLabel;
    private javax.swing.JLabel loginErrorMessage;
    private javax.swing.JPanel loginLeftPanel;
    private javax.swing.JLabel loginLoginLabel;
    private javax.swing.JLabel loginLogo;
    private javax.swing.JPanel loginMainPanel;
    private javax.swing.JPasswordField loginPasswordInput;
    private javax.swing.JLabel loginPasswordLabel;
    private javax.swing.JPanel loginRightPanel;
    private javax.swing.JButton loginSignupBtn;
    private javax.swing.JLabel logoRights;
    // End of variables declaration//GEN-END:variables
}
