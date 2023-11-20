package goodhealthwellbeing.util;

/**
 * Bmr.java
 * @author Ryan Stokes
 */
public abstract class Bmr {
    
    protected int age;
    protected double height;
    protected double weight;
    protected double bmr;

    public double getBmr() {
        return bmr;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
  
    
}
