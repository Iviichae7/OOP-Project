package goodhealthwellbeing.util;

/**
 * Bmr.java
 * @author Ryan Stokes
 */

//Abstract Siperclass to be overwritten by subclasses
public abstract class Bmr {
    
    //Declared data memebers
    protected int age;
    protected double height;
    protected double weight;
    protected double bmr;

    //Getters and Setters
    
    //Getter to be Overwritten
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
