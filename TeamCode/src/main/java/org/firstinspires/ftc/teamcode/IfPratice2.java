package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
public class IfPratice2 extends OpMode {
    @Override
    public void init() {

    }
    @Override
    public void loop() {
        double motorPower = gamepad1.left_stick_y;
        if (!gamepad1.a) {
            motorPower *= 0.5;
        }

        telemetry.addData("Motor Power", motorPower);
    }
}