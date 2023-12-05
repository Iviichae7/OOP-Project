package goodhealthwellbeing.util;

/**
 * Macro.java
 * @author Ryan Stokes
 */

//Abstarct class Macro is overiden depending on what instance it is
public abstract class Macro {
    
    //Data Memebers
    protected String macronutrient;
    protected String energy;
    protected String description;
    protected String sources;

    //Getters to be overiden in subclasses
    public abstract String getMacronutrient();
    
    public abstract String getEnergy();
    
    public abstract String getDescription();
    
    public abstract String getSources();
             
}
