
package goodhealthwellbeing;

import goodhealthwellbeing.view.ui.Login;

/**
 * @author Michael Babik
 * @author Md Hassan
 * @author Ryan Stokes
 */
public class GoodHealthWellBeing {

    public static void main(String[] args) {
        
        java.awt.EventQueue.invokeLater(() -> {
            new Login().setVisible(true);
        });
    }
    
}
