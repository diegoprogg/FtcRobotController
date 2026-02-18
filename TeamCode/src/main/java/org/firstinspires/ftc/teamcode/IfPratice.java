package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
public class IfPratice extends OpMode {
    @Override
    public void init() {

    }
    @Override
    public void loop() {
        double leftY = gamepad1.left_stick_y;
        if (leftY < 0){
            telemetry.addData("Left Stick Y", "Negative");

        }else if (leftY > 0.5){
            telemetry.addData("Left Stick Y", "More than 50%");

        }else if (leftY > 0) {
            telemetry.addData("Left Stick Y", "Positive");

        }else {
            telemetry.addData("Left Stick Y", "Zero");
        }
    }
}
