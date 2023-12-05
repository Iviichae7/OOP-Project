
package goodhealthwellbeing.view.components;

import goodhealthwellbeing.util.TotalCaloriesList;
import java.awt.event.ActionEvent;
import java.io.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 * CalorieTracker.java
 * @author Ryan Stokes
 */
public class CalorieTracker extends javax.swing.JFrame {

    //Data Memebers
    protected int totalCalories;
    protected String calories;
    protected File file;
    protected static File file2;
    //Singleton object initiation
    TotalCaloriesList tcl;
    /**
     * Creates new form CalorieTracker
     */
    public CalorieTracker(){
        initComponents();
        totalCalories = 0;
        file = new File("TotalCalories.txt");
        file2 = new File("CalorieHistory.txt");
        tcl = TotalCaloriesList.getInstance();
        calories = "";
        
        try {
            calorieLoad();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CalorieTracker.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        txtTotalCalories.setText(Integer.toString(totalCalories));
        
        //Button used to return to the previous form
        homeButton.addActionListener((ActionEvent e) -> {
            Nutrition nutrition = new Nutrition();
            nutrition.setVisible(true);
            CalorieTracker.this.setVisible(false);
        });
        
        //Button which adds calories to the total calorie amount, resets input to empty
        btnCalorieAdd.addActionListener((ActionEvent e) -> {
            
            calories = calorieInput.getText();
            totalCalories += Integer.parseInt(calories);
            txtTotalCalories.setText(Integer.toString(totalCalories));
            calorieInput.setText("");
            //Runs the calorieSave method which will save the total calories amount to a file, allowing for it to persist
            try {
                calorieSave();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(CalorieTracker.class.getName()).log(Level.SEVERE, null, ex);
            }    
        });
        
        //Button that will add the total daily calories to a file which can be accessed int he history section
        btnAddDay.addActionListener((ActionEvent e) -> {
            try {
                totalCalorieSave();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(CalorieTracker.class.getName()).log(Level.SEVERE, null, ex);
            }
            totalCalories = 0;
            try {
                calorieSave();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(CalorieTracker.class.getName()).log(Level.SEVERE, null, ex);
            }
            txtTotalCalories.setText(Integer.toString(totalCalories));
        });
        
        //Button which navigates to the calorie history form
        btnHistory.addActionListener((ActionEvent e) -> {
            CalorieHistory calHis = null;
            try {
                calHis = new CalorieHistory();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(CalorieTracker.class.getName()).log(Level.SEVERE, null, ex);
            }
            calHis.setVisible(true);
            CalorieTracker.this.setVisible(false);
        });
    }
    
    //Method which loads the total calorie amount that persists until add day is pressed
    public void calorieLoad() throws FileNotFoundException
    {
        try{
            try (Scanner in = new Scanner(file)) {
                while(in.hasNextLine())
                {
                    totalCalories = Integer.parseInt(in.nextLine());
                }
            }
        }catch(FileNotFoundException e){JOptionPane.showMessageDialog(null, e.toString());}
    }
    
    //Method to save the total calories to a file so it persists until add day is pressed
    public void calorieSave() throws FileNotFoundException{
        try (PrintStream out = new PrintStream(file)) {
            out.println(Integer.toString(totalCalories));
        }
    }
    
    //Method which adds the total calories to the history arraylist when add day is pressed, totalcalories is reset
    public void totalCalorieSave() throws FileNotFoundException {
        tcl.getCalories().clear();
        try ( // Use FileOutputStream with append mode
                PrintStream out2 = new PrintStream(new FileOutputStream(file2, true))) {
            tcl.addCalories(Integer.toString(totalCalories));
            for (int i = 0; i < tcl.getCalories().size(); i++) {
                out2.println(java.time.LocalDate.now() + " - " + tcl.getCalories().get(i));
            }
        }
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        calorieTrackerMainPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        loginLogo = new javax.swing.JLabel();
        logoRights = new javax.swing.JLabel();
        homeButton = new javax.swing.JButton();
        btnCalorieAdd = new javax.swing.JButton();
        lblPrompt1 = new javax.swing.JLabel();
        lblPrompt2 = new javax.swing.JLabel();
        lblTotalCalories = new javax.swing.JLabel();
        calorieInput = new javax.swing.JFormattedTextField();
        txtTotalCalories = new javax.swing.JFormattedTextField();
        btnHistory = new javax.swing.JButton();
        btnAddDay = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        calorieTrackerMainPanel.setBackground(new java.awt.Color(255, 255, 255));
        calorieTrackerMainPanel.setPreferredSize(new java.awt.Dimension(800, 500));
        calorieTrackerMainPanel.setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 500));

        loginLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ApplicationLogo.png"))); // NOI18N

        logoRights.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        logoRights.setForeground(new java.awt.Color(255, 255, 255));
        logoRights.setText("© 2023 Good Health & Well Being. All Rights Reserved");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logoRights, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loginLogo))
                .addContainerGap(10, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(loginLogo)
                .addGap(28, 28, 28)
                .addComponent(logoRights, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        calorieTrackerMainPanel.add(jPanel1);
        jPanel1.setBounds(0, 0, 400, 500);

        homeButton.setBackground(new java.awt.Color(255, 255, 255));
        homeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button_back.png"))); // NOI18N
        homeButton.setBorderPainted(false);
        homeButton.setContentAreaFilled(false);
        homeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeButtonActionPerformed(evt);
            }
        });
        calorieTrackerMainPanel.add(homeButton);
        homeButton.setBounds(420, 30, 50, 30);

        btnCalorieAdd.setBackground(new java.awt.Color(255, 255, 255));
        btnCalorieAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnCalorieAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button_add-calories.png"))); // NOI18N
        btnCalorieAdd.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnCalorieAdd.setContentAreaFilled(false);
        btnCalorieAdd.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCalorieAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalorieAddActionPerformed(evt);
            }
        });
        calorieTrackerMainPanel.add(btnCalorieAdd);
        btnCalorieAdd.setBounds(540, 230, 120, 40);

        lblPrompt1.setBackground(new java.awt.Color(0, 0, 0));
        lblPrompt1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblPrompt1.setForeground(new java.awt.Color(0, 0, 0));
        lblPrompt1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPrompt1.setText("Enter the amount of calories you wish to add to your");
        calorieTrackerMainPanel.add(lblPrompt1);
        lblPrompt1.setBounds(410, 80, 380, 30);

        lblPrompt2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblPrompt2.setForeground(new java.awt.Color(0, 0, 0));
        lblPrompt2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPrompt2.setText("daily total then press add.");
        calorieTrackerMainPanel.add(lblPrompt2);
        lblPrompt2.setBounds(510, 110, 170, 20);

        lblTotalCalories.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTotalCalories.setForeground(new java.awt.Color(0, 0, 0));
        lblTotalCalories.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTotalCalories.setText("Total Calories Today");
        calorieTrackerMainPanel.add(lblTotalCalories);
        lblTotalCalories.setBounds(490, 300, 220, 25);

        calorieInput.setOpaque(true);
        calorieInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calorieInputActionPerformed(evt);
            }
        });
        calorieTrackerMainPanel.add(calorieInput);
        calorieInput.setBounds(480, 150, 240, 50);

        txtTotalCalories.setEditable(false);
        txtTotalCalories.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtTotalCalories.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalCaloriesActionPerformed(evt);
            }
        });
        calorieTrackerMainPanel.add(txtTotalCalories);
        txtTotalCalories.setBounds(480, 340, 240, 50);

        btnHistory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button_history.png"))); // NOI18N
        btnHistory.setContentAreaFilled(false);
        btnHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHistoryActionPerformed(evt);
            }
        });
        calorieTrackerMainPanel.add(btnHistory);
        btnHistory.setBounds(650, 420, 80, 38);

        btnAddDay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button_add-day.png"))); // NOI18N
        btnAddDay.setContentAreaFilled(false);
        btnAddDay.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAddDay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddDayActionPerformed(evt);
            }
        });
        calorieTrackerMainPanel.add(btnAddDay);
        btnAddDay.setBounds(470, 420, 80, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(calorieTrackerMainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(calorieTrackerMainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void homeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_homeButtonActionPerformed

    private void btnCalorieAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalorieAddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCalorieAddActionPerformed

    private void calorieInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calorieInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_calorieInputActionPerformed

    private void txtTotalCaloriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalCaloriesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalCaloriesActionPerformed

    private void btnHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHistoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHistoryActionPerformed

    private void btnAddDayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddDayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddDayActionPerformed

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
            java.util.logging.Logger.getLogger(CalorieTracker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalorieTracker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalorieTracker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalorieTracker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new CalorieTracker().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddDay;
    private javax.swing.JButton btnCalorieAdd;
    private javax.swing.JButton btnHistory;
    private javax.swing.JFormattedTextField calorieInput;
    private javax.swing.JPanel calorieTrackerMainPanel;
    private javax.swing.JButton homeButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblPrompt1;
    private javax.swing.JLabel lblPrompt2;
    private javax.swing.JLabel lblTotalCalories;
    private javax.swing.JLabel loginLogo;
    private javax.swing.JLabel logoRights;
    private javax.swing.JFormattedTextField txtTotalCalories;
    // End of variables declaration//GEN-END:variables
}
