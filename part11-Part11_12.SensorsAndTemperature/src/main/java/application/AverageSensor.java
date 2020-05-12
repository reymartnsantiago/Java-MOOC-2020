/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AverageSensor implements Sensor {

    private List<Sensor> arr = new ArrayList<>();

    public void addSensor(Sensor toAdd) {
        arr.add(toAdd);
    }

    @Override
    public boolean isOn() {
//        if (arr.stream().anyMatch((obj) -> (obj.isOn()))) {
//            return true;
//        }

        int count = arr.size() - 1;
        int countt = 0;
        for (Sensor sense : arr) {
            if (sense.isOn() == true) {
                countt++;
            }
        }
        if(countt==count){
            return true;
        }
        return false;
    }

    @Override
    public void setOn() {
        arr.forEach((obj) -> {
            obj.setOn();
        });
    }

    public List<Integer> readings() {
        return arr.stream()
                .map(nat -> nat.read())
                .collect(Collectors.toList());
    }

    @Override
    public void setOff() {
        arr.forEach(nat -> {
            nat.setOff();
        });
    }

    @Override
    public int read() {
        int total = 0;
        if ((!arr.isEmpty())) {
            total = arr.stream()
                    .map((sens) -> sens.read())
                    .reduce(total, Integer::sum);
            return total / arr.size();
        }
        throw new IllegalStateException();
    }
}
