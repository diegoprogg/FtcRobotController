package org.firstinspires.ftc.teamcode.packages;

import com.qualcomm.robotcore.hardware.DistanceSensor;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.robotcore.external.navigation.DistanceUnit;

public class BancadaDeTestesDistancia {
    private DistanceSensor distancia;
    public void init(HardwareMap hwMap){
        distancia = hwMap.get(DistanceSensor.class, "sensor_distancia");
    }

    public double getDistancia() {
        return distancia.getDistance(DistanceUnit.CM);
    }
}
