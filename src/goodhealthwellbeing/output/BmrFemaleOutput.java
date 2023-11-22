package goodhealthwellbeing.output;

import goodhealthwellbeing.util.Bmr;

/**
 * BmrFemaleOutput.java
 * @author Ryan Stokes
 */

//Sub-class extends BMR superclass
public class BmrFemaleOutput extends Bmr {

    //Constructor
    public BmrFemaleOutput() {
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
        return 447.593 + (9.274 * weight) + (3.098 * height) - (4.330 * age);
    }
    
    
}
