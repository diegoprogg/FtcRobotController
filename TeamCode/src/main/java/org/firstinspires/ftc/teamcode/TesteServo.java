package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.teamcode.packages.BancadaDeTestesServo;

@TeleOp
@Disabled
public class TesteServo extends OpMode {
    BancadaDeTestesServo testesServo = new BancadaDeTestesServo();

    @Override
    public void init() {
        testesServo.init(hardwareMap);
    }

    @Override
    public void loop() {
        if (gamepad1.a){
            testesServo.setServoPos(1);
        }else {
            testesServo.setServoPos(0);
        }

        if (gamepad1.b){
            testesServo.setServoRot(1);
        }else {
            testesServo.setServoRot(0);
        }

    }
}
