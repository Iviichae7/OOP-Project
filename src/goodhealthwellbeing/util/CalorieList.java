package goodhealthwellbeing.util;

/**
 * CalorieList.java
 * @author Ryan Stokes
 */
public final class CalorieList {
    
    private int calories[];
    private static int index;
    
    private CalorieList()
    {
        calories = new int[10];
    }
    
    private static CalorieList INSTANCE = new CalorieList();
    
    public static CalorieList getInstance()
    {
        return INSTANCE;
    }
    
    public void addCalories(int calorie)
    {
        calories[index] = calorie;
        index++;
    }
    
    public int[] getCalories()
    {
        return calories;
    }
    
}
