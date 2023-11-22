package goodhealthwellbeing.output;

import goodhealthwellbeing.util.Bmr;

/**
 *
 * @author ryans
 */
public class BmrMaleOutput extends Bmr {

    public BmrMaleOutput() {
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
        return 88.362 + (13.397 * weight) + (4.799 * height) - (5.677 * age);
    }
    
    
}
