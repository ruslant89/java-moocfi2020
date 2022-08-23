package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AverageSensor implements Sensor {

    private ArrayList<Sensor> sensors;
    private ArrayList<Integer> degrees;

    public AverageSensor() {
        this.sensors = new ArrayList<>();
        this.degrees = new ArrayList<>();
    }

    @Override
    public boolean isOn() {
        return this.sensors.stream().allMatch(sensor -> sensor.isOn());
    }

    @Override
    public void setOn() {
        this.sensors.stream().forEach(sensor -> sensor.setOn());
    }

    @Override
    public void setOff() {
        this.sensors.stream().forEach(sensor -> sensor.setOff());
    }

    @Override
    public int read() {
        if (this.sensors.isEmpty() || !isOn()) {
            throw new IllegalStateException("Sensors are not working as expected");
        } else {
            int degree = (int) this.sensors.stream().mapToInt(sensors -> sensors.read()).average().getAsDouble();
            this.degrees.add(degree);
            return degree;
        }
    }

    public void addSensor(Sensor sensor) {
        this.sensors.add(sensor);
    }

    public List<Integer> readings() {
        return this.degrees.stream().collect(Collectors.toList());
    }
}
