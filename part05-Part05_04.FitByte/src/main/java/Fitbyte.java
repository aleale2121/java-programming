/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alefew
 */
public class Fitbyte {

    private  int restingHeartRate;
    private  double maxHeartRate;

    public Fitbyte(int age, int restingHeartRate) {
        this.restingHeartRate = restingHeartRate;
        this.maxHeartRate = calculateMaxHeartRate(age);
    }

    private double calculateMaxHeartRate(int age) {
        return 206.3 - (0.711 * age);
    }

    public double targetHeartRate(double percentageOfMaximum) {
        if (percentageOfMaximum < 0 || percentageOfMaximum > 1) {
            throw new IllegalArgumentException("Percentage must be between 0 and 1");
        }
        return (maxHeartRate - restingHeartRate) * percentageOfMaximum + restingHeartRate;
    }
   

}
