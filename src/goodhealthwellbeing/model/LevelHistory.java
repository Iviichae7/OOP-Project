/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package goodhealthwellbeing.model;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @MD MAHMUDUL HASAN
 */
public class LevelHistory  {

    private final File file;
    private final StressAndAnxiety stressAndAnxiety;
    private final Depression depression;
    
    int stressLevel;
    int depressionLevel;
    

    private static LevelHistory INSTANCE = new LevelHistory();

    private LevelHistory() {
        file = new File("levelHistory.txt");
        stressAndAnxiety =  StressAndAnxiety.getInstance();
        depression = Depression.getInstance();
        
        stressLevel = 0;
        depressionLevel = 0;
    }

    public static LevelHistory getInstance() {
        return INSTANCE;
    }

    public void createFile() {
        try {
            file.createNewFile();
            System.out.println(file.getAbsolutePath());
        } catch (IOException e) {
        }
    }

    public void writeFile() {
        stressLevel = stressAndAnxiety.getLevel(); // had to update the value of stress level here so that it can fetch the value once the check level has been called if not the result will be 0
        depressionLevel = depression.getLevel();
        try ( BufferedWriter fw = new BufferedWriter(new FileWriter("levelHistory.txt", true))) {
            fw.write("Stress level found: " + stressLevel + "\n");
            fw.write("Depression level found: " + depressionLevel + "\n");
            fw.close();
        } catch (IOException e) {

        }
    }

}
