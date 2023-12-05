package goodhealthwellbeing.util;

/**
 * Bmr.java
 * @author Ryan Stokes
 */

//Abstract Class Bmr
public abstract class Bmr {
    
    protected int age;
    protected double height;
    protected double weight;
    protected double bmr;

    //Abstract method is overriden in sub classes
    public double getBmr() {
        return bmr;
    }

    //Setters
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
