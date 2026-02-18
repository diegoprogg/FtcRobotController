package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
public class VariablePratice extends OpMode {
    @Override
    public void init() {
        int teamNumber = 24218;
        double motorSpeed = 0.6; // -1 até 1
        boolean clawOpen = false;
        String teamName = "Space Tech";

        telemetry.addData("Team Number", teamNumber );
        telemetry.addData("Motor Speed", motorSpeed );
        telemetry.addData("Claw Open", clawOpen );
        telemetry.addData("Team Name", teamName );
    }

    @Override
    public void loop() {

    }
}
