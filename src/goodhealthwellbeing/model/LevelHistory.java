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
public class LevelHistory {

    private final File file;
    private final StressAndAnxiety sta;
    private final Depression dp;
    int stressLevel;
    int depressionLevel;

    private static LevelHistory INSTANCE = new LevelHistory();

    private LevelHistory() {
        file = new File("levelHistory.txt");
        sta = new StressAndAnxiety();
        dp = new Depression();
        stressLevel = sta.getLevel();
        depressionLevel = dp.getLevel();
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
        try ( BufferedWriter fw = new BufferedWriter(new FileWriter("/Users/macbook/Desktop/Health_and_wellbeing/OOP-Project/levelHistory.txt", true))) {
            fw.write("Stress level found: " + stressLevel + "\n");
            fw.write("Depression level found: " + depressionLevel + "\n");
        } catch (IOException e) {

        }
    }

}
