package goodhealthwellbeing.util;

/**
 *
 * @author Ryan Stokes
 */
public abstract class Macro {
    
    protected String macronutrient;
    protected String energy;
    protected String description;
    protected String sources;

    
    public abstract String getMacronutrient();
    
    public abstract String getEnergy();
    
    public abstract String getDescription();
    
    public abstract String getSources();
             
}
