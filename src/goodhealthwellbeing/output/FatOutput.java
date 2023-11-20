package goodhealthwellbeing.output;

import goodhealthwellbeing.util.Macro;

/**
 *
 * @author Ryan Stokes
 */
public class FatOutput extends Macro {

    public FatOutput(String macronutrient, String energy, String description, String[] sources) {
        
        this.macronutrient = macronutrient;
        this.energy = energy;
        this.description = description;
        this.sources = sources;
    }

    public FatOutput() {
        
        macronutrient = "Fats";
        energy = "9 cals / gram";
        description = "Fats are essential macronutrients crucial for various bodily functions,"
                + " composed of carbon, hydrogen, and oxygen atoms. Categorized into saturated, "
                + "unsaturated, and trans fats, they serve as a concentrated source of energy, aiding in "
                + "nutrient absorption and supporting cell structure. While healthy fats promote heart health "
                + "and overall well-being, excessive intake of saturated and trans fats may pose health risks, "
                + "emphasizing the importance of a balanced and mindful approach to dietary fat consumption.";
        sources = new String[]{"Oils", "Butter", "Avocado", "Fatty Fish", "Full-Fat Dairy"};
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
