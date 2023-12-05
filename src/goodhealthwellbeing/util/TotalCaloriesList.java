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

//Singleton file which will hold the arraylist used in the total calories history
public final class TotalCaloriesList {
    
    //Private Data Memebers
    private final ArrayList<String> totalCalories;
    private final File file;
    
    //Private Constructor
    private TotalCaloriesList(){
        
        totalCalories = new ArrayList<>();
        file = new File("CalorieHistory.txt");
    }
    
    //Singleton Instance
    private static final TotalCaloriesList INSTANCE = new TotalCaloriesList();
    
    //Method used to return the Instance
    public static TotalCaloriesList getInstance()
    {
        return INSTANCE;
    }
    
    //Method used to add calories to the arraylsit totalCalories
    public void addCalories(String calorie)
    {
        totalCalories.add(calorie);
    }
    
    //Method to return the arraylist
    public ArrayList<String> getCalories()
    {
        return totalCalories;
    }
    
    //Method to load data from the total calories file into the arraylist
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
    

