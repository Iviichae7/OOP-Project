package goodhealthwellbeing.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * TotalCaloriesList.java
 * @author Ryan Stokes
 */
public final class TotalCaloriesList {
    
    private final ArrayList<String> totalCalories;
    private File file;
    
    private TotalCaloriesList(){
        
        totalCalories = new ArrayList<>();
        file = new File("CalorieHistory.txt");
    }
    
    private static final TotalCaloriesList INSTANCE = new TotalCaloriesList();
    
    public static TotalCaloriesList getInstance()
    {
        return INSTANCE;
    }
    
    public void addCalories(String calorie)
    {
        totalCalories.add(calorie);
    }
    
    public ArrayList<String> getCalories()
    {
        return totalCalories;
    }
    
    public void loadFile() throws FileNotFoundException
    {
        try{
        Scanner in = new Scanner(file);
        while(in.hasNextLine())
        {
            totalCalories.add(in.nextLine());
        }    
        in.close();
        }catch(FileNotFoundException e){JOptionPane.showMessageDialog(null, e.toString());}
    }
}
    

