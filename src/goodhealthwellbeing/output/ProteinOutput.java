package goodhealthwellbeing.output;

import goodhealthwellbeing.util.Macro;

/**
 * ProteinOutput.java
 * @author Ryan Stokes
 */
public class ProteinOutput extends Macro {

    //Default Constructor
    public ProteinOutput(String macronutrient, String energy, String description, String sources) {
        
        this.macronutrient = macronutrient;
        this.description = description;
        this.energy = energy;
        this.sources = sources;
    }

    //Constructor
    public ProteinOutput() {
        
        macronutrient = "Protein";
        energy = "4 cals / gram";
        description = "Proteins are complex macromolecules comprised of amino acids,"
                + " essential for the structure, function, and regulation of cells and tissues in living organisms."
                + " Arranged in polypeptide chains, proteins exhibit diverse roles, acting as enzymes, antibodies,"
                + " and structural components in cells. Proteins contribute "
                + "significantly to the growth, repair, and maintenance of body tissues, playing "
                + "a vital role in overall health and functionality.";
        sources = "Red Meat | Chicken | Fish | Dairy | Nuts";
    }

    //Getters to override superclass getter methods
    @Override
    public String getMacronutrient() {
        return macronutrient;
    }

    @Override
    public String getEnergy() {
        return energy;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public String getSources() {
        return sources;
    }
    
    
    
    
}