package goodhealthwellbeing.output;

import goodhealthwellbeing.util.Bmr;

/**
 * BmrMaleOutput.java
 * @author Ryan Stokes
 */

//Sub-class extends BMR superclass
public class BmrMaleOutput extends Bmr {
    
    //Constructor
    public BmrMaleOutput() {
    }
    
    //Setters to retrieve info from form
    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    //Getter which overrides superclass getter
    @Override
    public double getBmr() {
        return 88.362 + (13.397 * weight) + (4.799 * height) - (5.677 * age);
    }
    
    
}
