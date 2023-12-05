package goodhealthwellbeing.output;

import goodhealthwellbeing.util.Bmr;

/**
 * BmrMaleOutput.java
 * @author ryans
 */
public class BmrMaleOutput extends Bmr {

    //Constuctor
    public BmrMaleOutput() {
    }

    //Setters
    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    //Getter overides abstract method
    @Override
    public double getBmr() {
        return 88.362 + (13.397 * weight) + (4.799 * height) - (5.677 * age);
    }
    
    
}
