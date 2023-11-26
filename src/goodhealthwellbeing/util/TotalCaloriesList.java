package goodhealthwellbeing.util;

import java.util.ArrayList;

/**
 * TotalCaloriesList.java
 * @author Ryan Stokes
 */
public final class TotalCaloriesList {
    
    private final ArrayList<String> totalCalories;
    
    private TotalCaloriesList(){
        
        totalCalories = new ArrayList<>();

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
}
    

