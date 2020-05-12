/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author Cavitecity
 */
public class TemperatureSensor implements Sensor {

    private Boolean sensor = false;

    @Override
    public boolean isOn() {
        return sensor;
    }

    @Override
    public void setOn() {
        sensor = true;
    }

    @Override
    public void setOff() {
        sensor = false;
    }

    @Override
    public int read() {
        if (sensor) {
            return ThreadLocalRandom.current().nextInt(-30, 30);
        }
        throw new NumberFormatException();
    }

}
