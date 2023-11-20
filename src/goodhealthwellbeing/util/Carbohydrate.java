package goodhealthwellbeing.util;

import java.util.ArrayList;

/**
 *
 * @author ryans
 */
public class Carbohydrate extends Macro {

    public Carbohydrate(String macronutrient, String energy, String description, String[] sources){
        
        this.macronutrient = macronutrient;
        this.energy = energy;
        this.description = description;
        this.sources = sources;
    }

    public Carbohydrate() {
        
        macronutrient = "Carbohydrate";
        energy = "9 cals / gram";
        description = "Carbohydrates are organic compounds composed of carbon, "
                + "hydrogen, and oxygen, serving as a primary source of energy for the human body. "
                + "Classified into simple sugars, complex carbohydrates, and dietary fiber, "
                + "they play a crucial role in fueling various physiological processes.";
        sources = new String[]{"Pasta", "Rice", "Bread", "Potatoes", "Grains"};
    }

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
    public String[] getSources() {
        return sources;
    }
    
    
       
}
