package goodhealthwellbeing.output;

import goodhealthwellbeing.util.Bmr;

/**
 *
 * @author Ryan Stokes
 */
public class BmrFemaleOutput extends Bmr {

    public BmrFemaleOutput() {
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public double getBmr() {
        return 447.593 + (9.274 * weight) + (3.098 * height) - (4.330 * age);
    }
    
    
}
