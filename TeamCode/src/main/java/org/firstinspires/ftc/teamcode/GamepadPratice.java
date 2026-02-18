package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
@Disabled
@TeleOp
public class GamepadPratice extends OpMode {
    @Override
    public void init() {

    }

    @Override
    public void loop() {
        double motorPower = -gamepad1.left_stick_y;
        double differenceXJoysticks = gamepad1.left_stick_x - gamepad1.right_stick_x;
        double sumTriggers = gamepad1.left_trigger + gamepad1.right_trigger;
        telemetry.addData("Left X", gamepad1.left_stick_x);
        telemetry.addData("Left Y", gamepad1.left_stick_y);
        telemetry.addData("Right X", gamepad1.right_stick_x);
        telemetry.addData("Right Y", gamepad1.right_stick_y);
        telemetry.addData("A Button", gamepad1.a);
        telemetry.addData("B Button", gamepad1.b);
        telemetry.addData("Difference X Joysticks", gamepad1.left_stick_x - gamepad1.right_stick_x);
        telemetry.addData("Sum Triggers", sumTriggers);
    }
}
