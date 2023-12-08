/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package goodhealthwellbeing.model;

/**
 *
 * @MD MAHMUDUL HASAN
 */

public class StressAndAnxiety extends MentalHealth{
    
    
    private StressAndAnxiety(){
        message="";
        answer="";
        level=0;
        
    }
    private static StressAndAnxiety INSTANCE= new StressAndAnxiety();
    
    public static StressAndAnxiety getInstance(){
        return INSTANCE;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
        
    }
    
    @Override
    public void checkLevel(){
         /*if (answer.equals("yes")) {
            level++;
        }*/
         
         String concatenatedAnswers = answer;
           // Split the concatenated string into individual answers
        String[] answers = concatenatedAnswers.split(" ");
        // Check each answer and increment the level for "yes"
        for (String ans : answers) {
            if (ans.equals("yes")) {
                level++;
            }
        }
         
          

        
         if (level == 0 || level == 1) {
             
            message="Your Stress level is low. Please follow our breathing excercise.";
            
        } else if (level == 2) {
            
            message="Your stress level is moderate.";
            
        } else if (level == 3 || level <=5) {
            
            message="Stress level High detected please go to find support section to get help now!";
            
        } else {
            
            message="Could not check level,Please try again.";
        }
        
        
    }

    public String getMessage() {
        return message;
    }

    public int getLevel() {
        return level;
    }
//    @Override
//    public String toString(){
//        
//        return message+" "+level;
//    }
    

    
    
     
    
}
