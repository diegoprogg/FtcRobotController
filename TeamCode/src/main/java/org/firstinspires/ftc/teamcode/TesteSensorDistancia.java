package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.packages.BancadaDeTestesDistancia;

@TeleOp
@Disabled
public class TesteSensorDistancia extends OpMode {
    double distancia;
    BancadaDeTestesDistancia sensorDistancia = new BancadaDeTestesDistancia();
    @Override
    public void init() {
        sensorDistancia.init(hardwareMap);

    }

    @Override
    public void loop() {
        distancia = sensorDistancia.getDistancia();
        if (distancia < 10){
            telemetry.addLine("Muito perto!");
        }
        telemetry.addData("Sensor Distância", distancia);

    }
}
