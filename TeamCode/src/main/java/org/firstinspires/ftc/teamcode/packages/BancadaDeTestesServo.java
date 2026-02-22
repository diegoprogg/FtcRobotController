package org.firstinspires.ftc.teamcode.packages;

import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

public class BancadaDeTestesServo {
    private Servo servoPos;
    private CRServo servoRot;

    public void init(HardwareMap hwMap){
        servoPos = hwMap.get(Servo.class, "servo_pos");
        servoRot = hwMap.get(CRServo.class, "servo_rot");
        servoRot.setDirection(DcMotorSimple.Direction.REVERSE);

    }

    public void setServoPos(double angle){
        servoPos.setPosition(angle);
    }

    public void setServoRot(double power) {
        servoRot.setPower(power);
    }
}
